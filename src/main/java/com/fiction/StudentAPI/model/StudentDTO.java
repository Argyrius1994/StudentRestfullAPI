package com.fiction.StudentAPI.model;


import lombok.Data;

import java.util.Date;

@Data
public class StudentDTO {

    private final Long id;
    private final String studentFirstName;
    private final String studentLastName;
    private final String studentBirthDate;
    private final String studentAddress;


}
