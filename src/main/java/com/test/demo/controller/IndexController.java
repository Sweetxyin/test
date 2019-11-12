package com.test.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@RestController
    public class IndexController {

        @RequestMapping ( "/index")
        public  ModelAndView toLogin(){
            ModelAndView modelAndView=new ModelAndView();
            modelAndView.setViewName("index");
            return modelAndView;
        }
        @RequestMapping ( "/alllogin")
        public  ModelAndView toAllLogin(){
            ModelAndView modelAndView=new ModelAndView();
            modelAndView.setViewName("alllogin");
            return modelAndView;
        }

        @RequestMapping ( "/studentlogin")
    public ModelAndView toStudentLogin(){
            ModelAndView modelAndView=new ModelAndView();
            modelAndView.setViewName("studentlogin");
            return modelAndView;
    }

    @RequestMapping ( "/teacherlogin")
    public ModelAndView toTeacherLogin(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("teacherlogin");
        return modelAndView;
    }
    @RequestMapping ( "/studentindex")
    public ModelAndView tostudentindex(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("studentindex");
        return modelAndView;
    }



}
