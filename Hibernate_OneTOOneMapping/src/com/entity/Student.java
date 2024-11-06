package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student {
	
	@Id
	private int stud_id;
	private String s_name;
	
	@OneToOne
	private Laptop laptop;
	
	public Student() {
		
	}

	public Student(int stud_id, String s_name, Laptop laptop) {
		super();
		this.stud_id = stud_id;
		this.s_name = s_name;
		this.laptop = laptop;
	}

	public int getStud_id() {
		return stud_id;
	}

	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	@Override
	public String toString() {
		return "Student [stud_id=" + stud_id + ", s_name=" + s_name + ", laptop=" + laptop + "]";
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
	

}
