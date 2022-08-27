package com.example2.example2.Service;

import com.example2.example2.Entity.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
//@Component
@Service
public class StudentService {
    //traer informacion o crear informacion.
    public List<Student> getStudent(){
        ArrayList<Student> students = new ArrayList<>();
        Student carlos = new Student(1L,"carlos","23");
        Student Diana = new Student(1L,"diana","23");
        Student wilson = new Student(1L,"wilson","23");

        students.add(carlos);
        students.add(Diana);
        students.add(wilson);

        return students;
    }
}
