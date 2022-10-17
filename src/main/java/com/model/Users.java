package com.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Users {
	
	 @Id
     @GeneratedValue
     private int userNo;	 
     private String userName;
     
     @JsonManagedReference
     @OneToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
     private UserAccount userAccount;

	public Users() {
		super();
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public UserAccount getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(UserAccount userAccount) {
		this.userAccount = userAccount;
	}

	@Override
	public String toString() {
		return "User [userNo=" + userNo + ", userName=" + userName + ", userAccount=" + userAccount + "]";
	}
	
     
	
     
}
