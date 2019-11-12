package com.test.demo.service;

import com.test.demo.dao.DepartmentDao;
import com.test.demo.model.Department;
import com.test.demo.model.Teacher;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public interface DepartmentService {
    List<Teacher> getDepartmentList();

    boolean inserDepartment(Department department);

    boolean updateDepartment(Department department);

    boolean deleteDepartment(Integer department_id);

    Department getDepartmentId(Integer department_id);
}
