package com.example.demo.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {
	@Id
	private int empId;
	private String empName;
	private int empSal;
	private String empDesg;
	private Date empDOJ;

}
