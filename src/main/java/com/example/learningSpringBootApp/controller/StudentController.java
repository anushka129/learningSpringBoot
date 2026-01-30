package com.example.learningSpringBootApp.controller;

import com.example.learningSpringBootApp.dto.StudentDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/student")
    public StudentDto getStudent() {
        return new StudentDto(9L, "Anushka", "anushka@gmail.com");
    }

    @GetMapping("/student/{id}")
    public StudentDto getStudentById() {
        return new StudentDto(9L, "Anushka", "anushka@gmail.com");
    }
}
