package com.fiction.StudentAPI.service;

import com.fiction.StudentAPI.model.StudentDTO;
import com.fiction.StudentAPI.model.StudentEntity;
import com.fiction.StudentAPI.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public StudentDTO createStudent(StudentDTO student)
    {
        studentRepository.save(new StudentEntity(student.getId(),student.getStudentFirstName(),student.getStudentLastName(),student.getStudentBirthDate(),student.getStudentAddress()));
        return student;
    }
    public StudentDTO getStudentById(Long id)
    {
        Optional<StudentEntity> byId = studentRepository.findById(id);
        if (byId.isPresent())
        {
            StudentEntity studentEntity = byId.get();
            return new StudentDTO(studentEntity.getId(),studentEntity.getStudentFirstName(),studentEntity.getStudentLastName(),studentEntity.getStudentBirthDate(),studentEntity.getStudentAddress());
        }
        throw new IllegalArgumentException("Id was not found in Database");
    }


}
