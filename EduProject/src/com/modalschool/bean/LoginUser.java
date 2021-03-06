package com.modalschool.bean;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author udaykumar swamy
 *
 */
@Entity
@Table(name = "MS_USER_META")
public class LoginUser {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "USER_ID")
	private double userId;

	@Column(name = "USER_NAME")
	private String userName;

	@Column(name = "USER_MAIL_ID")
	private String userMailId;

	@Column(name = "ACCESS_TYPE")
	private int accessType;

	@Column(name = "PASSWORD")
	private String password;

	@Column(name = "LAST_LOGIN")
	private String lastLogin;

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

	public String getUserMailId() {
		return userMailId;
	}

	public void setUserMailId(String userMailId) {
		this.userMailId = userMailId;
	}

	public int getAccessType() {
		return accessType;
	}

	public void setAccessType(int accessType) {
		this.accessType = accessType;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(String lastLogin) {
		this.lastLogin = lastLogin;
	}

}
