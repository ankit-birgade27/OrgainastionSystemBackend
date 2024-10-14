package com.sj.OrganizationSystem.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sj.OrganizationSystem.entity.Country;
import com.sj.OrganizationSystem.entity.Employee;

import com.sj.OrganizationSystem.service.MyService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class MainController {
	
	@Autowired
	MyService service;
	
	@PostMapping("/addcountry")
	public String addcountry(@RequestBody Country c) {
		
		String msg = service.addcountry(c);
		return msg;
		
	}
	
	@PutMapping("/Updatecountry")
	public String Updatecountry(@RequestBody Country c) {
		
		String msg = service.Updatecountry(c);
		return msg;
		
	}
	
	@DeleteMapping("/deletecountry/{id}")
	public String deletecountry(@PathVariable int id) {
		
		String msg = service.deletecountry(id);
		return msg;
		
	}
	
	@GetMapping("/getAllCountry")
	public List<Country> getAllCountry(){
		
		List<Country> list= service.getAllCountry();
		return list;
		
	} 
	
	@GetMapping("/getCountryById/{id}")
	public Country getCountryById(@PathVariable int id) {
		
		Country c= service.getCountryById(id);
		return c;
		
	}

	
	@PostMapping("/addemp")
	public String addemp(@RequestBody Employee emp) {
		
		String msg = service.addemp(emp);
		return msg;
		
	}
	
	@PutMapping("/updateemp")
	public String updateemp(@RequestBody Employee emp) {
		
		String msg= service.updateemp(emp);
		return msg;
		
	}	
	@DeleteMapping("/deleteemp/{id}")
	public String deleteemp(@PathVariable int id) {
		
		String msg = service.deleteemp(id);
		return msg;
		
	}
		
	
	@GetMapping("/getAllEmp")
	public List<Employee> getAllEmployee(){
		List<Employee> list= service.getAllEmployee();
		return list;
	}
	
	@GetMapping("/getbyId/{id}")
	public Employee getparticularById(@PathVariable int id ) {
		
		Employee emp= service.getparticularById(id);
		return emp;
		
	}
	
	
	@GetMapping("/getbyStatus/{status}")
	public List<Employee> getListByStatus(@PathVariable String status){
		List<Employee> list=service.getListByStatus(status);
		return list;
		
	}
	
	@PostMapping("/login")
	public HashMap loginUser(@RequestBody Employee emp) {
		
		HashMap map= service.loginUser(emp);
		return map;
		
	}
	

}
