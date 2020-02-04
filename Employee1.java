package com.cts.model1;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.DiscriminatorValue;
import javax.persistence.DiscriminatorType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@Table(name="Employee1")
@DiscriminatorColumn(name="emp_type" ,
  discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("emp")

//@Inheritance(strategy=InheritanceType.JOINED)
//@Table(name="BaseEmps")


//@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
//@Table(name="OnlyEmps")

public class Employee1 {
	@Id
	@Column(name="empid")
	private long empid;
	@Column(name="empname")
	private String empname;
	@Column(name="ebasic")
	private double basic;
	public Employee1() {
		super();
	}
	public Employee1(long empid,String empname,double basic) {
		super();
		this.empid=empid;
		this.empname=empname;
		this.basic=basic;
	}
	
	public long getEmpid() {
		return empid;
	}
	public void setEmpid(long empid) {
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
	
	
}
