package com.test.demo.service.impl;

import com.test.demo.dao.TeacherDao;
import com.test.demo.model.Teacher;
import com.test.demo.service.TeacherServier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TheacherServiceImpl implements TeacherServier {

    @Resource
    private TeacherDao teacherDao;

    @Override
    public Teacher teacherLogin(String teacher_name, Integer password) {
        return teacherDao.teacherLogin(teacher_name,password);
    }

    @Override
    public List<Teacher> getTeacherList() {
        return teacherDao.getTeacherList();
    }

    @Override
    public boolean inserTeacher(Teacher teacher) {
        boolean status=false;
        if (teacherDao.inserTeacher(teacher)==1){
            status=true;
        }else {
            status=false;
        }
        return status;
    }

    @Override
    public boolean updateTeacher(Teacher teacher) {
        boolean stutas=false;
        if (teacherDao.updateTeacher(teacher)==1){
            stutas=true;
        }else {
            stutas=false;
        }
        return stutas;
    }

    @Override
    public boolean deleteTeacher(Integer teacher_id) {
        boolean stutas=false;
        if (teacher_id!=null){
           int n= teacherDao.deleteTeacher(teacher_id);
           if (n==1){
               stutas=true;
           }
        }
        return stutas;
    }

    @Override
    public Teacher getTeacherId(Integer teacher_id) {
        Teacher teacher=null;
        if (teacher_id!=null){
            teacher=teacherDao.getTeacherId(teacher_id);
        }
        return teacher;
    }
}
