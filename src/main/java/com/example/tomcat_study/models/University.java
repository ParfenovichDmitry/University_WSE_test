package com.example.tomcat_study.models;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Student> studentList = new ArrayList<>();
    private List<Teacher> teacherList = new ArrayList<>();

    public University(List<Student> studentList, List<Teacher> teacherList) {
        this.studentList = studentList;
        this.teacherList = teacherList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    @Override
    public String toString() {
        return "University{" +
                "studentList=" + studentList +
                ", teacherList=" + teacherList +
                '}';
    }
}
