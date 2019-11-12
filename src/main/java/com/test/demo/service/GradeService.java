package com.test.demo.service;

import com.test.demo.model.Grade;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GradeService {
    List<Grade> getGradeList();
    Grade getGradeId(Integer grade_id);
    List<Grade> searchGrade(Grade grade);
}
