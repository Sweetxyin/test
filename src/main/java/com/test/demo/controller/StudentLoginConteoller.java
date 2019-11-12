package com.test.demo.controller;

import com.test.demo.model.Class;
import com.test.demo.model.Student;
import com.test.demo.service.StudentService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;


@RestController
@RequestMapping("/student")
public class StudentLoginConteoller {

    @Resource
    private StudentService studentService;

/*
    *//*学生登录功能*//*
    @ResponseBody
    @RequestMapping(value = "/studentLogin",method = RequestMethod.POST)
    public ModelAndView StudentLogin(int student_id, String student_name, HttpSession session){
        ModelAndView modelAndView=new ModelAndView();
        Student student=studentService.studentLogin(student_id,student_name);
        if (student!=null){
         session.setAttribute("student",student);
         modelAndView.setViewName("xmindex");
        }else{
            modelAndView.setViewName("studentlogin");
        }
        return modelAndView;
    }*/
   /* 返回所有list*/
   @ResponseBody
    @RequestMapping(value = "/studentList")
    public ModelAndView studentList(Model model){
     model.addAttribute("list",studentService.StudentList());
     Student user=new Student();
       model.addAttribute("user",user);

     return new ModelAndView("studentindex","userModel",model);
   }
    /*跳转到新增页面*/
    @RequestMapping(value = "/toStudentAdd")
    public ModelAndView tostudentAdd(Model model){
        return new ModelAndView("studentadd" );
    }

    /*执行新增操作*/
    @ResponseBody
    @RequestMapping(value="/doStudentAdd" ,method = RequestMethod.POST)
    public ModelAndView studentAdd(Model model,Student student){
        model.addAttribute(studentService.studentAdd(student));
        model.addAttribute("myMessage", "新增成功");
        return new ModelAndView("redirect:/student/studentList");
    }
   /*跳转到修改页面*/
   @RequestMapping(value = "/toStudentUpdate/{student_id}")
   public ModelAndView tostudentUpdate(Model model,@PathVariable Integer student_id){
       model.addAttribute("user",studentService.getStudentID(student_id));
       return new ModelAndView("studentUpdate" ,"userModel",model);
   }
   /*执行修改操作*/
   @ResponseBody
    @RequestMapping(value="/doStudentUpdate",method = RequestMethod.POST)
    public ModelAndView studentUpdate(Model model,Student student){
        model.addAttribute("user",studentService.studentUpdate(student));

       return new ModelAndView("redirect:/student/studentList","userModel",model);

   }


    @RequestMapping(value="/studentDelete/{student_id}")
    public ModelAndView studentDelete(Model model,@PathVariable Integer student_id){
        studentService.studentDelete(student_id);
        return new ModelAndView("redirect:/student/studentList");
}
}
