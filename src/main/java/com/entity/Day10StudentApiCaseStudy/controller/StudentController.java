package com.entity.Day10StudentApiCaseStudy.controller;

import com.entity.Day10StudentApiCaseStudy.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService service;

    @GetMapping("/Student")
    public List<String> retrieveByName(){
        List<String> students=service.getByNAme();
        return students;
    }

    @GetMapping("/Student/{withgrade}")
    public List retrieveByGrade(){
        List students=service.getByGrade();
        return students;
    }

    @GetMapping("/Student/{withgrade}/{withstream}")
    public List retrieveByStream(){
        List students=service.getBySpecificStream();
        return students;
    }

    @GetMapping("/Student/{withgrade}/{withstream}/{withA}")
    public List retrieveByA(){
        List students=service.getByA();
        return students;
    }

    @GetMapping("/Student/count")
    public Integer retrieveByCount(){
        Integer students=service.getByCount();
        return students;
    }

    @GetMapping("/Student/withf")
    public List retrieveByF(){
        List students=service.getByF();
        return students;
    }

}
