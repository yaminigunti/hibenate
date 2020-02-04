package com.cts.model;

import java.util.Date;

public class Buyer {
 private int id;
 private String username;
 private String password;
 private String email_id;
 private String mobilenumber;
 private Date createdate;
 public Buyer()
 {
 }
	 public Buyer(int id, String username, String password, String email_id, String mobilenumber, Date createdate ) {
		 super();
		 this.id=id;
		 this.username=username;
		 this.password=password;
		 this.email_id=email_id;
		 this.mobilenumber=mobilenumber;
		 this.createdate=createdate;
	 }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	 
 }
 

