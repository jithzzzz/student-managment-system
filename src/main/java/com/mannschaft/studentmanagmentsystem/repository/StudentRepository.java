package com.mannschaft.studentmanagmentsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mannschaft.studentmanagmentsystem.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
