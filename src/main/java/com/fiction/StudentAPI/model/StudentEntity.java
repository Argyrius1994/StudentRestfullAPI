package com.fiction.StudentAPI.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Entity
public class StudentEntity {

    @Id
    @Column(name = "STUDENT_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name ="STUDENT_FIRST_NAME")
    private String studentFirstName;
    @Column(name ="STUDENT_LAST_NAME")
    private String studentLastName;
    @Column(name = "STUDENT_BIRTH_DATE")
    private String studentBirthDate;
    @Column(name = "STUDENT_ADDRESS")
    private String studentAddress;

    public StudentEntity() {
    }

    public StudentEntity(Long id, String studentFirstName, String studentLastName, String studentBirthDate, String studentAddress) {
        this.id = id;
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.studentBirthDate = studentBirthDate;
        this.studentAddress = studentAddress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public String getStudentBirthDate() {
        return studentBirthDate;
    }

    public void setStudentBirthDate(String studentBirthDate) {
        this.studentBirthDate = studentBirthDate;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }
}
