package com.annachi.department.service;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.annachi.department.entity.Department;
import com.annachi.department.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService 
{
	public static final Logger log = Logger.getLogger(DepartmentService.class.getName());
	@Autowired
	private DepartmentRepository departmentRepo;
	
	public Department saveDepartment(Department department)
	{		
		log.info("fine");
		return departmentRepo.save(department);				
	}	
	public Department getDepartment(Long departmentId) 
	{	
		return departmentRepo.findById(departmentId).orElse(null);
	}
}
