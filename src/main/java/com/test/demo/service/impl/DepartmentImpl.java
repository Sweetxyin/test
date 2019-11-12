package com.test.demo.service.impl;

import com.test.demo.dao.DepartmentDao;
import com.test.demo.model.Department;
import com.test.demo.model.Teacher;
import com.test.demo.service.DepartmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class DepartmentImpl implements DepartmentService {
    @Resource
    private DepartmentDao departmentDao;

    @Override
    public List<Teacher> getDepartmentList() {
        return departmentDao.getDepartmentList();
    }

    @Override
    public boolean inserDepartment(Department department) {

        boolean status=false;
        if (departmentDao.inserDepartment(department)==1){
            status=true;
        }else {
            status=false;
        }
        return status;
    }

    @Override
    public boolean updateDepartment(Department department) {
        boolean status=false;
        if (departmentDao.updateDepartment(department)==1){
            status=true;
        }else {
            status=false;
        }
        return status;
    }

    @Override
    public boolean deleteDepartment(Integer department_id) {
        boolean stutas=false;
        if (department_id!=null){
            int n=departmentDao.deleteDepartment(department_id);
            if (n==1){
                stutas=true;
            }

        }
        return stutas;
    }

    @Override
    public Department getDepartmentId(Integer department_id) {
        Department department=null;
        if (department_id!=null){
            department=departmentDao.getDepartmentId(department_id);
        }
        return department;
    }
}
