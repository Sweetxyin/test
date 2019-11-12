package com.test.demo.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.test.demo.model.Teacher;
import com.test.demo.service.TeacherServier;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;


@RestController
@RequestMapping()
public class TeacherContller {

    @Resource
    private TeacherServier teacherServier;

  /* *//*教师登录功能*//*
    @ResponseBody
    @RequestMapping(value = "/doTeacherLogin", method = RequestMethod.POST)
    public ModelAndView theacherLogin(String teacher_name,String password, HttpSession session) {
        Teacher teacher = teacherServier.teacherLogin(teacher_name, password);
        ModelAndView modelAndView=new ModelAndView();
        if (teacher != null) {
            session.setAttribute("teacher", teacher);
            modelAndView.setViewName("xmindex");
        } else {
            modelAndView.setViewName("teacherlogin");
        }
        return modelAndView;
    }*/

    /*跳转首页并获取list*/
    @ResponseBody
    @RequestMapping(value = "/teacherindex")
    public ModelAndView theacherList( Model model){
        model.addAttribute("list",teacherServier.getTeacherList());
        Teacher teacher=new Teacher();
        model.addAttribute("teacher",teacher);
        return new ModelAndView("teacherindex","teacherModel",model);
    }

    /*跳转新增页面*/
    @RequestMapping(value = "/toInsertTeacher")
    public ModelAndView toinsertTeacher(){
        return  new ModelAndView("teacheradd");
    }

    /*执行新增操作*/
    @ResponseBody
    @RequestMapping(value = "/doInsertTeacher",method = RequestMethod.POST)
    public ModelAndView insertTeacher(Model model,Teacher teacher){
        model.addAttribute("list",teacherServier.inserTeacher(teacher));
        return  new ModelAndView("redirect:/teacherindex");
    }

  @RequestMapping(value = "/toUpdateTeacher/{teacher_id}")
    public ModelAndView updateTeacher(Model model, @PathVariable Integer teacher_id){
        model.addAttribute("list",teacherServier.getTeacherId(teacher_id));
        return new ModelAndView("teacherupdate","teacherModel",model);
  }
  @ResponseBody
  @RequestMapping(value = "/doUpdateTeacher",method = RequestMethod.POST)
    public ModelAndView updateTeacher(Model model,Teacher teacher){
        model.addAttribute("list",teacherServier.updateTeacher(teacher));
        return new ModelAndView("redirect:/teacherindex","teacherModel",model);
  }

  @ResponseBody
    @RequestMapping(value = "/deleteTeacher/{teacher_id}")
    public ModelAndView deleteTeacher(@PathVariable Integer teacher_id){
        teacherServier.deleteTeacher(teacher_id);
        return new ModelAndView("redirect:/teacherindex");
  }
}
