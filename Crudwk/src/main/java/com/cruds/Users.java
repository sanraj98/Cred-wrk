package com.cruds;

import java.util.Date;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
@Component
public class Users {
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int uid;
	@Column(name="Names")
	private String uNames;
	@Column(name="Password")
	private String pass;
	@Column(name="Email")
	private String email;
	@Column(name="Sex")
	private String sex;
	@Column(name="DOB")
	private Date dob;
	public Users() {
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getuNames() {
		return uNames;
	}
	public void setuNames(String uNames) {
		this.uNames = uNames;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Users [uid=" + uid + ", uNames=" + uNames + ", pass=" + pass + ", email=" + email + ", sex=" + sex
				+ "]";
	}
}
