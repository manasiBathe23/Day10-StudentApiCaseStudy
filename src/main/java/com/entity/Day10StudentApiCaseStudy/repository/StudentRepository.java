package com.entity.Day10StudentApiCaseStudy.repository;

import com.entity.Day10StudentApiCaseStudy.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
    // public List<Student> findByStudentName (String studentName);
    @Query(value="select studentName from student",nativeQuery = true)
    List<String> find();
    @Query(value="select studentId,studentName,grade from student",nativeQuery = true)
    List findWithGrade();
    @Query(value = "select studentId,studentName,stream from student where stream='Comm'",nativeQuery = true)
    List findWithStream();
    @Query(value="select studentId,studentName,grade from student where grade='A'",nativeQuery = true)
    List findWithA();
    @Query(value = "select count(studentId) from student where stream='Science'",nativeQuery = true)
    Integer findCount();
    @Query(value="select studentId,studentName,grade,stream from student where stream='Comm' and grade='F'",nativeQuery = true)
    List findF();
}
