package com.example.demo.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student;
@Repository
public class StudentDAOimpl implements StudentDAO
{
	@Autowired
	EntityManager entitymanager;
	public StudentDAOimpl(EntityManager entitymanager)
	{
		this.entitymanager=entitymanager;
	}
	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub

		Query query=entitymanager.createQuery("from Student");
		List<Student> lis=query.getResultList();
		return lis;
	}

	@Override
	@Transactional
	public void save(Student st) {
		// TODO Auto-generated method stub
		
		entitymanager.merge(st);
	}
	@Override
	public Student get(int sid) {
		// TODO Auto-generated method stub
		Student st1=entitymanager.find(Student.class,sid);
		
		return st1;
	}

	@Override
	@Transactional
	public void delete(int sid) {
		// TODO Auto-generated method stub
		Student s2=entitymanager.find(Student.class, sid);
		entitymanager.remove(s2);
	}
	
	

}
