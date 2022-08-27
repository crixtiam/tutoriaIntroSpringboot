package com.example2.example2;

import com.example2.example2.Entity.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class Example2Application {

	public static void main(String[] args) {
		SpringApplication.run(Example2Application.class, args);
		System.out.println("hola");

	}
    /*
	@RequestMapping(path = "/api/student")
	@GetMapping
	public List<Student> hola(){
		ArrayList<Student> students = new ArrayList<>();
		Student carlos = new Student(1L,"carlos","23");
		Student Diana = new Student(1L,"diana","23");
		Student wilson = new Student(1L,"wilson","23");

		students.add(carlos);
		students.add(Diana);
		students.add(wilson);

		return students;
	}*/


}
