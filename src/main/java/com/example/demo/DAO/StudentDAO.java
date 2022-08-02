package com.example.demo.DAO;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentDAO 
{
	
	List<Student> getAll();
	Student get(int sid);
	void save(Student st);
	void delete(int sid);
	
}
