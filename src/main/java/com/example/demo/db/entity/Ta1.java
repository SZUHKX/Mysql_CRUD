package com.example.demo.db.entity;

public class Ta1 {
    private Integer id;

    private String studentName;

    private String studentTeacherName;

    private Integer studentAcademIndex;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    public String getStudentTeacherName() {
        return studentTeacherName;
    }

    public void setStudentTeacherName(String studentTeacherName) {
        this.studentTeacherName = studentTeacherName == null ? null : studentTeacherName.trim();
    }

    public Integer getStudentAcademIndex() {
        return studentAcademIndex;
    }

    public void setStudentAcademIndex(Integer studentAcademIndex) {
        this.studentAcademIndex = studentAcademIndex;
    }
}