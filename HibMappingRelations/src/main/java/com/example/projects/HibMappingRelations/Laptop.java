package com.example.projects.HibMappingRelations;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {
	@Id
	private int lid;
	private String lname;
	@ManyToMany
	private List<Student> studs = new ArrayList<Student>();
	
	public List<Student> getStuds() {
		return studs;
	}
	public void setStuds(List<Student> studs) {
		this.studs = studs;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	

}
