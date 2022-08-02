package com.example.demo.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.StudentDAOimpl;
import com.example.demo.entity.Student;

@Service
public class Serviceimpl implements Services{
	
	@Autowired
	StudentDAOimpl studimpl;
	@Override
	@Transactional
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return studimpl.getAll();
	}
	@Transactional
	@Override
	public Student get(int sid) {
		// TODO Auto-generated method stub
		return studimpl.get(sid);
	}
	@Transactional
	@Override
	public void save(Student st) {
		// TODO Auto-generated method stub
		studimpl.save(st);
	}
	@Transactional
	@Override
	public void delete(int sid) {
		// TODO Auto-generated method stub
		studimpl.delete(sid);		
	}

	

}
