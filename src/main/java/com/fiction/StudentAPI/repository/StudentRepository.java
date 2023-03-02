package com.fiction.StudentAPI.repository;

import com.fiction.StudentAPI.model.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity,Long> {



}
