package com.test.demo.dao;

import com.test.demo.model.Department;
import com.test.demo.model.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DepartmentDao {

    List<Teacher> getDepartmentList();

    int inserDepartment(Department department);

    int updateDepartment(Department department);

    int deleteDepartment(Integer department_id);

    Department getDepartmentId(Integer department_id);


}
