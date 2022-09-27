package com.mannschaft.studentmanagmentsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mannschaft.studentmanagmentsystem.entity.Student;
import com.mannschaft.studentmanagmentsystem.repository.StudentRepository;

@SpringBootApplication
public class StudentManagmentSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagmentSystemApplication.class, args);
	}

	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
//		Student student1 = new Student("Ramesh", "John", "ramesh@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2 = new Student("Ram", "Muthu", "ram@gmail.com");
//		studentRepository.save(student2);
//		
//		Student student3 = new Student("Gopika", "Ajay", "gopika@gmail.com");
//		studentRepository.save(student3);
		
		
	}

}
