package com.example.learningSpringBootApp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class StudentDto {
    private long id;
    private String name;
    private String email;

}
