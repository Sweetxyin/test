package com.test.demo.service.impl;

import com.test.demo.dao.ClassDao;
import com.test.demo.dao.KcDao;
import com.test.demo.dao.StudentDao;
import com.test.demo.model.Class;
import com.test.demo.model.Kc;
import com.test.demo.model.Student;
import com.test.demo.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Resource
    private StudentDao studentDao;
    @Resource
    private ClassDao classDao;
    @Resource
    private KcDao kcDao;


    @Override
    public Student studentLogin( String student_name,Integer password) {
        return studentDao.studentLogin(student_name,password);
    }

    @Override
    public List<Student> StudentList() {
        return studentDao.StudentList();
    }

    @Override
    public boolean studentAdd(Student student) {
        boolean status=false;
        if (studentDao.studentAdd(student)==1){
            status=true;
        }else {
            status=false;
        }
        return status;
    }

    @Override
    public boolean studentUpdate(Student student) {
        boolean status=false;
        if (studentDao.studentUpdate(student)==1){
            status=true;
        }else {
            status=false;
        }
        return status;
    }

    @Override
    public boolean studentDelete(Integer student_id) {
     boolean status=false;
     if (student_id!=null) {
         int n = studentDao.studentDelete(student_id);
         if (n == 1) {
             status = true;
         }
     }
        return status;
    }

    @Override
    public Student getStudentID(Integer student_id) {
        Student student=null;
        if (student_id!=null){
            student=studentDao.getStudentID(student_id);
        }
        return student;
    }

    @Override
    public Class getClassId(Integer class_id) {
        Class classn=null;
        if (class_id!=null){
            classn=classDao.getClassId(class_id);
        }
        return classn;
    }

 /*   @Override
    public List<Class> getClassList() {
        return classDao.getClassList();
    }

    @Override
    public Kc getKcId(Integer kc_id) {
        Kc kc=null;
        if (kc_id!=null){
            kc=kcDao.getKcId(kc_id);
        }
        return null;
    }
*/
}
