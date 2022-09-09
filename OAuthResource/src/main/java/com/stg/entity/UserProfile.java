package com.stg.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class UserProfile {
	private String name;
	private String email;
	
	public UserProfile() {
		super();
	}

	public UserProfile(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	// Setters and getters
	

	@Override
	public String toString() {
		return "UserProfile [name=" + name + ", email=" + email + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}