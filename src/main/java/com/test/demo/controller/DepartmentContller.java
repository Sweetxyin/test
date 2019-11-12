package com.test.demo.controller;

import com.test.demo.model.Department;
import com.test.demo.model.Teacher;
import com.test.demo.service.DepartmentService;
import com.test.demo.service.TeacherServier;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;


@RestController
@RequestMapping()
public class DepartmentContller {

    @Resource
    private DepartmentService departmentService;



    /*跳转首页并获取list*/
    @ResponseBody
    @RequestMapping(value = "/departmentindex")
    public ModelAndView departmentList( Model model){
        model.addAttribute("list",departmentService.getDepartmentList());
        Department department=new Department();
        model.addAttribute("department",department);
        return new ModelAndView("departmentindex","departmentModel",model);
    }

    /*跳转新增页面*/
    @RequestMapping(value = "/toInsertDepartment")
    public ModelAndView toinsertDepartment(){
        return  new ModelAndView("departmentadd");
    }

    /*执行新增操作*/
    @ResponseBody
    @RequestMapping(value = "/doInsertDepartment",method = RequestMethod.POST)
    public ModelAndView insertTeacher(Model model,Department department){
        model.addAttribute("list",departmentService.inserDepartment(department));
        return  new ModelAndView("redirect:/departmentindex");
    }

  @RequestMapping(value = "/toUpdateDepartment/{department_id}")
    public ModelAndView updateDepartment(Model model, @PathVariable Integer department_id){
        model.addAttribute("list",departmentService.getDepartmentId(department_id));
        return new ModelAndView("departmentupdate","departmentModel",model);
  }
  @ResponseBody
  @RequestMapping(value = "/doUpdateDepartment",method = RequestMethod.POST)
    public ModelAndView updateDepartment(Model model,Department department){
        model.addAttribute("list",departmentService.updateDepartment(department));
        return new ModelAndView("redirect:/departmentindex","departmentModel",model);
  }

  @ResponseBody
    @RequestMapping(value = "/deleteDepartment/{department_id}")
    public ModelAndView deleteDepartment(@PathVariable Integer department_id){
        departmentService.deleteDepartment(department_id);
        return new ModelAndView("redirect:/departmentindex");
  }
}
