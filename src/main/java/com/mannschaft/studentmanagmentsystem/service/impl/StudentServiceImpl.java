package com.mannschaft.studentmanagmentsystem.service.impl;

import com.mannschaft.studentmanagmentsystem.entity.Student;
import com.mannschaft.studentmanagmentsystem.repository.StudentRepository;
import com.mannschaft.studentmanagmentsystem.service.StudentService;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
	
	private StudentRepository studentRepository;
	
	// Constructor based dependency injunction  
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}



	@Override
	public List<Student> getAllStudents(){
		return studentRepository.findAll();
		
	}
	
	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);
	}

}
