package com.fiction.StudentAPI.controlers;


import com.fiction.StudentAPI.model.StudentDTO;
import com.fiction.StudentAPI.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
public class RestRequestController {

    private final StudentService studentService;

    public RestRequestController(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/create")
    public String createStudent(@RequestBody StudentDTO studentDTO){
        studentService.createStudent(studentDTO);
        return "Student Created, Check the Database";
    }
    @GetMapping(value = "/get/{id}")
    public ResponseEntity<?> getStudent(@PathVariable(value = "id") Long id){
        return ResponseEntity.ok(studentService.getStudentById(id));
    }


}
