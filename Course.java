package com.cts.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Courses")
public class Course {
	@Id
	private int cid;
	private String cName;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="course")
	private Set<Trainee> Trainees;
	
	public Course()
	{
		
	}
 
public Course(int cid, String cName, Set<Trainee> trainees) {
		super();
		this.cid = cid;
		this.cName = cName;
		Trainees = trainees;
	}

public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getcName() {
	return cName;
}
public void setcName(String cName) {
	this.cName = cName;
}
public Set<Trainee> getTrainees() {
	return Trainees;
}
public void setTrainee(Set<Trainee> Trainees) {
	this.Trainees = Trainees;
}
 
 
}
