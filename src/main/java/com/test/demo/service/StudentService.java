package com.test.demo.service;

import com.test.demo.model.Class;
import com.test.demo.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    /*学生登录功能*/
    Student studentLogin(String student_name,Integer password );
    /*返回所有集合*/
    List<Student> StudentList();

    /*添加一条数据*/
    boolean studentAdd(Student student);

    /*修改学生*/
    boolean studentUpdate(Student student);

    /*根据id删除账号*/
    boolean studentDelete(Integer student_id);

    /*根据标识符获取ID*/
    Student getStudentID(Integer student_id);

    Class getClassId(Integer class_id);

}