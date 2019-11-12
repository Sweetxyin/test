package com.test.demo.model;

public class Grade {
    private  Integer grade_id;
    private  String grade;

    private  int student_id;
    private  Student student_name;
    private  Integer kc_id;
    private Kc kc_name;
    private  String year;

    public Kc getKc_name() {
        return kc_name;
    }

    public void setKc_name(Kc kc_name) {
        this.kc_name = kc_name;
    }

    public Grade() {
    }

    public Student getStudent_name() {
        return student_name;
    }

    public void setStudent_name(Student student_name) {
        this.student_name = student_name;
    }

    public Integer getGrade_id() {
        return grade_id;
    }

    public void setGrade_id(Integer grade_id) {
        this.grade_id = grade_id;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Integer getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }

    public Integer getKc_id() {
        return kc_id;
    }

    public void setKc_id(Integer kc_id) {
        this.kc_id = kc_id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
