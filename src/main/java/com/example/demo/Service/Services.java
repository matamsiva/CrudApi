package com.example.demo.Service;

import java.util.List;

import com.example.demo.entity.Student;

public interface Services 
{

	List<Student> getAll();
	Student get(int sid);
	void delete(int sid);
	void save(Student st);
}
