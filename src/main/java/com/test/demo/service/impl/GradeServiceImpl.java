package com.test.demo.service.impl;

import com.test.demo.dao.DepartmentDao;
import com.test.demo.dao.GradeDao;
import com.test.demo.model.Department;
import com.test.demo.model.Grade;
import com.test.demo.model.Teacher;
import com.test.demo.service.DepartmentService;
import com.test.demo.service.GradeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service

public class GradeServiceImpl implements GradeService {
    @Resource
    private GradeDao gradeDao;


    @Override
    public List<Grade> getGradeList() {
        return gradeDao.getGradeList();
    }

    @Override
    public Grade getGradeId(Integer grade_id) {
        Grade grade=null;
        if (grade_id!=null){
            grade=gradeDao.getGradeId(grade_id);
        }
        return grade;
    }

    @Override
    public List<Grade> searchGrade(Grade grade) {
        return gradeDao.searchGrade(grade);
    }
}
