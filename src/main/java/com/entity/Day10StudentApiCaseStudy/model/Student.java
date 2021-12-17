package com.entity.Day10StudentApiCaseStudy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "stud")
public class Student {
    @Id
    @Column(name="studentId")
    Integer studentId;
    @Column(name="studentName")
    String studentName;
    @Column(name ="stream")
    String stream;
    @Column(name="grade")
    String grade;

    public Student() {
    }

    public Student(Integer studentId, String studentName, String stream, String grade) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.stream = stream;
        this.grade = grade;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
