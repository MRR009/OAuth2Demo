package com.stg.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserProfile {
	private String name;
	private String email;

	// Setters and getters

	@Override
	public String toString() {
		return "UserProfile [name=" + name + ", email=" + email + "]";
	}
}