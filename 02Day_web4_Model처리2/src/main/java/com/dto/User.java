package com.dto;

public class User {

	String userid;
	String passwd;
	
	public User() {
	}

	public User(String userid, String passwd) {
		super();
		this.userid = userid;
		this.passwd = passwd;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", passwd=" + passwd + "]";
	}
	
	
	
}
