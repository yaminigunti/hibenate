package com.cts.model1;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("ContEmp")
public class ContractEmp extends Employee1{
	@Column(name="duration")
	private int duration;
	
	public ContractEmp() {
		super();
	}
	public ContractEmp(long empid,String empname,double basic, int duration) {
		super(empid,empname,basic);
		this.duration=duration;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}

}
