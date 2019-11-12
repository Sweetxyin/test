package com.test.demo.dao;

import com.test.demo.model.Grade;

import java.util.List;


public interface GradeDao {
    List<Grade> getGradeList();
    Grade getGradeId(Integer grade_id);

    List<Grade> searchGrade(Grade grade);
}
