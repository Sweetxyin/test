package com.test.demo.controller;

import com.test.demo.model.Student;
import com.test.demo.model.Teacher;
import com.test.demo.service.StudentService;
import com.test.demo.service.TeacherServier;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;


@RestController
@RequestMapping("")
public class LoginConteoller {

    @Resource
    private StudentService studentService;

    @Resource
    private TeacherServier teacherServier;

    @ResponseBody
    @RequestMapping(value = "/doLogin",method = RequestMethod.POST)
    public ModelAndView doLogin(HttpSession session,Model model,
                                @RequestParam(value = "name") String name,
                                @RequestParam(value = "password") Integer password,
                                @RequestParam(value = "radio",required = false) Integer radio){

        ModelAndView modelAndView=new ModelAndView();
        if (radio==1){
            if (studentService.studentLogin(name,password)!=null){
                session.setAttribute("radio",radio);
                model.addAttribute("myMessage","登录成功");
                modelAndView.setViewName("xmindex");
            }else {
                model.addAttribute("myMessage","登录失败");
                modelAndView.setViewName("alllogin");
            }
        }else if (radio==2){
            if (teacherServier.teacherLogin(name,password)!=null){
                session.setAttribute("radio",radio);
                modelAndView.setViewName("xmindex");
            }else {
                modelAndView.setViewName("alllogin");
            }
        }
        model.addAttribute("radio",radio);
        return modelAndView;
    }
/*

    */
/*教师登录功能*//*

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
    }

    */
/*学生登录功能*//*

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
    }
*/


}
