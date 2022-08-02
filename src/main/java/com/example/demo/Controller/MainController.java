package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DAO.StudentDAOimpl;
import com.example.demo.Service.Serviceimpl;

import com.example.demo.entity.Student;
@RestController
@RequestMapping("/app")
public class MainController 
{
	@Autowired
	StudentDAOimpl Daoimpl;
	
	@GetMapping("/student")
	public List<Student> get()
	{
		return Daoimpl.getAll();
	}
	
	@GetMapping("/student/{sid}")
	public Student get(@PathVariable int sid)
	{
		return Daoimpl.get(sid);
	}
	@DeleteMapping("/student/{sid}")
	public String delete(@PathVariable int sid)
	{
		Daoimpl.delete(sid);
		return "sucessfull deleted the respective id"+sid;
	}
	@PostMapping("/student")
	public Student save(@RequestBody Student st)
	{
		Daoimpl.save(st);
		return st;
	}
	@PutMapping("/student/{sid}")
	public Student update(@RequestBody Student st)
	{
		Daoimpl.save(st); 
		return st;
	}
}
