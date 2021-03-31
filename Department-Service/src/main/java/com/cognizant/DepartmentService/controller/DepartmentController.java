package com.cognizant.DepartmentService.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.DepartmentService.entity.Department;
import com.cognizant.DepartmentService.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class DepartmentController {
	   
    @Autowired
    private DepartmentService deptSerice;
    
    @PostMapping("/")
    public Department saveDept(@RequestBody Department dept) {
        log.info("Inside saveDept method of DepartmentController!!");
        return deptSerice.saveDept(dept);
    }
    
    @GetMapping("/departments/{deptId}")
    public Optional<Department> getDept(@PathVariable int deptId) {
        log.info("Inside getDept method of DepartmentController!!");
        return deptSerice.getDept(deptId);
        
    }

}
