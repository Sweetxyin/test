package com.test.demo.dao;

import com.test.demo.model.Class;

import java.util.List;

public interface ClassDao {


    Class getClassId(Integer class_id);
    List<Class> getClassList();
}
