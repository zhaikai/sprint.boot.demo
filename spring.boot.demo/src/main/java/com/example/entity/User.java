package com.example.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import java.util.UUID;

import javax.persistence.Transient;


@Table(name="user")
public class User {
	
	@Transient
	private String id;
	private String userName;
	private String passWord;
	private String email;
	private String phone;


	public User() {
	}

	public User(String id,String userName, String passWord, String email,String phone) {
		this.id = id;
		this.userName = userName;
		this.passWord = passWord;
		this.email = email;
		this.phone = phone;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}



	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "User{" + "id=" + id + ", userName='" + userName + '\'' + ", passWord='" + passWord + '\''
				+ ", email='" + email + '\'' + '}';
	}
}