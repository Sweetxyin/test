package com.test.demo.model;

public class Student {

    private Integer student_id;
    private  String student_name;
    private int class_id;
    private  Class class_name;
    private int grade_id;
    private Grade grade_name;
    private int kc_id;
    private  Kc kc_name;
    private  String sex;
    private  String home_add;
    private  String telephone;
    private  Integer password;

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public int getGrade_id() {
        return grade_id;
    }

    public void setGrade_id(int grade_id) {
        this.grade_id = grade_id;
    }

    public Grade getGrade_name() {
        return grade_name;
    }

    public void setGrade_name(Grade grade_name) {
        this.grade_name = grade_name;
    }

    public int getKc_id() {
        return kc_id;
    }

    public void setKc_id(int kc_id) {
        this.kc_id = kc_id;
    }

    public Kc getKc_name() {
        return kc_name;
    }

    public void setKc_name(Kc kc_name) {
        this.kc_name = kc_name;
    }

    public Integer getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public int getClass_id() {
        return class_id;
    }

    public void setClass_id(int class_id) {
        this.class_id = class_id;
    }

    public Class getClass_name() {
        return class_name;
    }

    public void setClass_name(Class class_name) {
        this.class_name = class_name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getHome_add() {
        return home_add;
    }

    public void setHome_add(String home_add) {
        this.home_add = home_add;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Student() {
    }
}
