package com.example.projects.HibMappingRelations;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Student {
	@Id
	private int rollno;
	private String sname;
	private int marks;
	@ManyToMany
	private List<Laptop> laps = new ArrayList<Laptop>();
	
	
	public List<Laptop> getLaps() {
		return laps;
	}
	public void setLaps(List<Laptop> laps) {
		this.laps = laps;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	

}
