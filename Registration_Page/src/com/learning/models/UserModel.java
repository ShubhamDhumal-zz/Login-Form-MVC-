package com.learning.models;

public class UserModel {

	private String userName;
	private String userEmail;
	private String userPwd;
	private String userCont;
	
	public UserModel() {
		super();

	}

	public UserModel(String userName, String userEmail, String userPwd, String userCont) {
		super();
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPwd = userPwd;
		this.userCont = userCont;
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

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserCont() {
		return userCont;
	}

	public void setUserCont(String userCont) {
		this.userCont = userCont;
	}

	@Override
	public String toString() {
		return "UserModel [userName=" + userName + ", userEmail=" + userEmail + ", userPwd=" + userPwd + ", userCont="
				+ userCont + "]";
	}
	
	
}
