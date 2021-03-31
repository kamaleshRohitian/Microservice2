package com.cognizant.DepartmentService.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="DEPT_ID")
    private int deptId;
    @Column(name="DEPT_NAME")
    private String deptName;
    @Column(name="deptAddress")
    private String DEPT_ADDRESS;
    @Column(name="deptCode")
    private String DEPT_CODE;
}
