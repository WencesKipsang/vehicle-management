package com.wences.fleetmappp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
		
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
	private int id;
    private String firstname;
	private String lastname;
	private String username;
	private String password;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	 public String getPassword() {
			return password;
		}
	 public String getUsername() {
			return username;
		}
//	public User getPassword() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	public void setPassword(User password2) {
//		// TODO Auto-generated method stub
//		
//	}
//	public String getUsername() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	

}
