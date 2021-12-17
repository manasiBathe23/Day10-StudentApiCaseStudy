package com.entity.Day10StudentApiCaseStudy.service;

import com.entity.Day10StudentApiCaseStudy.model.Student;
import com.entity.Day10StudentApiCaseStudy.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository repository;

    public List<String> getByNAme(){
        List<String> studentname= repository.find();
        return (List<String>) studentname;
    }
    public List getByGrade(){
        List studentgrade=repository.findWithGrade();
        return studentgrade;
    }
    public List getBySpecificStream(){
        List studentstream=repository.findWithStream();
        return studentstream;
    }
    public List getByA(){
        List studentA=repository.findWithA();
        return studentA;
    }
    public Integer getByCount(){
        Integer studentCount=repository.findCount();
        return studentCount;
    }
    public List getByF(){
        List studentF=repository.findF();
        return studentF;
    }

}
