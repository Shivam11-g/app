package com.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.*;

@Entity
public class UserAccount {

	@Id
	private String emailId;
	private String password;
	
	@JsonBackReference
	@OneToOne
	private Users user;

	public UserAccount() {
		super();
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}
	
}
