package com.app.model;

import javax.persistence.*;

@Entity
@Table(name="USERS_TAB")
public class User {

	@Id
	@GeneratedValue
	@Column(name="u_Id")
	private int userId;
	@Column(name="u_Name")
	private String userName;
	@Column(name="u_Email")
	private String userEmail;
	@Column(name="u_Contact")
	private String userContact;
	@Column(name="u_Pwd")
	private String userPwd;
	@Column(name="u_Address")
	private String userAddress;
	
	public User() {
		super();
	}

	public User(int userId) {
		this.userId = userId;
	}

	

	public User(int userId, String userName, String userEmail,
			String userContact, String userPwd, String userAddress) {
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userContact = userContact;
		this.userPwd = userPwd;
		this.userAddress = userAddress;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserContact() {
		return userContact;
	}

	public void setUserContact(String userContact) {
		this.userContact = userContact;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName
				+ ", userEmail=" + userEmail + ", userContact=" + userContact
				+ ", userPwd=" + userPwd + ", userAddress=" + userAddress + "]";
	}

	
	
	
}
