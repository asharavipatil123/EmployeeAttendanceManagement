package com.mph.entity;

import javax.persistence.Entity;  
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.NamedQueries;
//import javax.persistence.NamedQuery;
//import javax.persistence.SequenceGenerator;


/*
@NamedQueries(
		{ 
			
		    @NamedQuery(name = "GET_EMP_BY_EID", query = "from Employee e where e.eid=:eid") 
		})*/
@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_sequence")
	//@SequenceGenerator(name = "emp_sequence", allocationSize = 1)
	private int eid;
	private String ename;
	private String email;
	private String password;
	private String role;
	private double phone;
	private String worklocation;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eid, String ename, String email, String password, String role, double phone,
			String worklocation) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.email = email;
		this.password = password;
		this.role = role;
		this.phone = phone;
		this.worklocation = worklocation;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public double getPhone() {
		return phone;
	}
	public void setPhone(double phone) {
		this.phone = phone;
	}
	public String getWorklocation() {
		return worklocation;
	}
	public void setWorklocation(String worklocation) {
		this.worklocation = worklocation;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", email=" + email + ", password=" + password + ", role="
				+ role + ", phone=" + phone + ", worklocation=" + worklocation + "]";
	}
	
	
}