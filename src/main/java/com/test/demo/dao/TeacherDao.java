package com.test.demo.dao;

import com.test.demo.model.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherDao {

    List<Teacher> getTeacherList();

    int inserTeacher(Teacher teacher);

    int updateTeacher(Teacher teacher);

    int deleteTeacher(Integer teacher_id);

    Teacher getTeacherId(Integer teacher_id);
    Teacher teacherLogin(@Param("teacher_name")String teacher_name, @Param("password")Integer password);

}
