package com.cts.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class Employee {
  @Id 
  @Column(name="empid" )
   private int empid;
  @Column(name="empname",nullable=false)
  private String empname;
  private double basic;
  public Employee( ) {
	  
  }
public Employee( int empid, String empname, double basic) {
	super();
	this.empid=empid;
	this.empname=empname;
	this.basic=basic;
	  
  }
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public double getBasic() {
	return basic;
}
public void setBasic(double basic) {
	this.basic = basic;
}
@Override
public String toString() {
	return "Employee [empid=" + empid + ", empname=" + empname + ", basic=" + basic + "]";
}
  
}
