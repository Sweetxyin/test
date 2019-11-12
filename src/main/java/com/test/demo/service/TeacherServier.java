package com.test.demo.service;

import com.test.demo.model.Teacher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TeacherServier {
    Teacher teacherLogin(String teacher_name,Integer password);
    List<Teacher> getTeacherList();

    boolean inserTeacher(Teacher teacher);

    boolean updateTeacher(Teacher teacher);

    boolean deleteTeacher(Integer teacher_id);

    Teacher getTeacherId(Integer teacher_id);


}
