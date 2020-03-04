package com.cts.model1;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("mang")
public class ManagerEmp extends Employee1 {
	@Column(name="allowance")
	private double allowance;

	public ManagerEmp(long empid,String empname,double basic,double allowance) {
		super(empid,empname,basic);
		this.allowance=allowance;
	}
	public ManagerEmp() {

	}
	public double getAllowance() {
		return allowance;
	}
	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}

}