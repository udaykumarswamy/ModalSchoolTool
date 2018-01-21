package com.modalschool.to;

import java.sql.Date;

/**
 * @author uday kumar swamy
 *
 */
public class LoginUserTo {

	private String userName;
	private double userId;
	private Date lastLogin;
	private String isAuthenticatedUser;
	private int accessType;
	
	
	public double getUserId() {
		return userId;
	}
	public void setUserId(double userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}
	public String getIsAuthenticatedUser() {
		return isAuthenticatedUser;
	}
	public void setIsAuthenticatedUser(String isAuthenticatedUser) {
		this.isAuthenticatedUser = isAuthenticatedUser;
	}
	public int getAccessType() {
		return accessType;
	}
	public void setAccessType(int accessType) {
		this.accessType = accessType;
	}
}
