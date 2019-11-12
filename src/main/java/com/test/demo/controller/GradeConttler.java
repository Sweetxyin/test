package com.test.demo.controller;


import com.test.demo.model.Grade;
import com.test.demo.service.GradeService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@RestController
public class GradeConttler {

    @Resource
    private GradeService gradeService;


    @RequestMapping(value = "/gardeindexList")
    public ModelAndView getGradeList(Model model){
        model.addAttribute("list",gradeService.getGradeList());
        Grade grade=new Grade();
        model.addAttribute("grade",grade);
        return  new ModelAndView("gardeindex","gradeModel",model);
    }

    @RequestMapping(value = "/gradeSearch/{student_id}" ,method = RequestMethod.POST)
    public ModelAndView searchGrade(Model model,/* @PathVariable int student_id,*/Grade grade1){
        model.addAttribute("list",gradeService.searchGrade(grade1));
        Grade grade=new Grade();
        model.addAttribute("grade",grade);
        return new ModelAndView("gardesearch","gradeModel",model);


    }
}
