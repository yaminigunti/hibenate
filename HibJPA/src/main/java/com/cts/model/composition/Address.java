package com.cts.model.composition;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private String dno;
	private String addressline1;
	private String addressline2;
	
	public Address() {
		
	}
	
  public Address(String dno,String addressline1,String addressline2) {
	super();
  }

public String getDno() {
	return dno;
}

public void setDno(String dno) {
	this.dno = dno;
}

public String getAddressline1() {
	return addressline1;
}

public void setAddressline1(String addressline1) {
	this.addressline1 = addressline1;
}

public String getAddressline2() {
	return addressline2;
}

public void setAddressline2(String addressline2) {
	this.addressline2 = addressline2;
}

}
