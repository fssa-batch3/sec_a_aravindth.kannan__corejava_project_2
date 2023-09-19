package com.fssa.sharpandclean.model;

public class User {
	
	
	private String email;
	private String username;
	private String password;
	private String phonenumber;
	private String type;
	private int isDeleted;
	
	
	public User( String email, String username, String password, String phonenumber,
			int isDeleted) {
		super();
		
		this.email = email;
		this.username = username;
		this.password = password;
		this.phonenumber = phonenumber;
		
		this.isDeleted = isDeleted;
	}
	
	public User(String email, String username, String password, String phonenumber) {
		super();
		
		this.email = email;
		this.username = username;
		this.password = password;
		this.phonenumber = phonenumber;
	
	}
	
	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}


	public User(String email, int isDeleted) {
		super();
		this.email = email;
		this.isDeleted = isDeleted;
	}




	public User(String newUserName, String newPassword, String newMobileNumber) {
		this.username = newUserName;
		this.password = newPassword;
		this.phonenumber = newMobileNumber;
		
	}

	

	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
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


	public String getPhonenumber() {
		return phonenumber;
	}


	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int isDeleted() {
		return isDeleted;
	}

	
	public void setDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", username=" + username + ", password=" + password + ", phonenumber="
				+ phonenumber + ", type=" + type + ", isDeleted=" + isDeleted + ", getEmail()=" + getEmail()
				+ ", getUsername()=" + getUsername() + ", getPassword()=" + getPassword() + ", getPhonenumber()="
				+ getPhonenumber() + ", getType()=" + getType() + ", isDeleted()=" + isDeleted() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	

}
