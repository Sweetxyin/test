package com.test.demo.dao;

import com.test.demo.model.Student;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface StudentDao {
    /*学生登录功能*/
    Student studentLogin(@Param("student_name") String student_name,@Param("password") Integer password);

    /*返回所有集合*/
    List<Student> StudentList();

    /*添加一条数据*/
    int studentAdd(Student student);

    /*修改学生*/
    int studentUpdate(Student student);

    /*根据id删除账号*/
    int studentDelete(Integer student_id);

    /*根据标识符获取ID*/
    Student getStudentID(Integer student_id);

}
