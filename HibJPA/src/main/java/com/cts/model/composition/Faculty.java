package com.cts.model.composition;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="faculty")
public class Faculty {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long facId;
	private String facName;
	@Embedded
	private Address address;
	public Faculty() {
		
	}

	public Faculty(String facName, Address address) {
		super();
		
		this.facName=facName;
		this.address=address;
	}

	

	public String getFacName() {
		return facName;
	}

	public void setFacName(String facName) {
		this.facName = facName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}
