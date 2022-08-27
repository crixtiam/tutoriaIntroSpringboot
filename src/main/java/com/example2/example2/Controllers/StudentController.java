package com.example2.example2.Controllers;

import com.example2.example2.Entity.Student;
import com.example2.example2.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/student")
public class StudentController {
    private final StudentService studentService;

    @Autowired // new StudentService...
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }
    @GetMapping
    public List<Student> getStudents(){
        return studentService.getStudent();
    }

}
