package com.namanraj.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.namanraj.demo.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {
	
	public Student findByRollAndPassword(String roll , String password); 

}
