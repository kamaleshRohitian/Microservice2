package com.cognizant.DepartmentService.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.DepartmentService.entity.Department;
import com.cognizant.DepartmentService.repository.DepartmentRepository;

@Service
public class DepartmentService{
	
	@Autowired
	DepartmentRepository departmentRepository;

	public Department saveDept(Department dept) {
		
		return departmentRepository.save(dept);
	}

	public Optional<Department> getDept(int deptId) {
		
		return departmentRepository.findById(deptId);
	}
	

}
