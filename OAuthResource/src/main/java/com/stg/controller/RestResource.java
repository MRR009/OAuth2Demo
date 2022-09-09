package com.stg.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.stg.entity.UserProfile;

@Controller
public class RestResource {
	
	@RequestMapping(value = "/api/users/me" /* , method = RequestMethod.GET */ )
	public ResponseEntity<UserProfile> profile() {
		//Build some dummy data to return for testing
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String email = user.getUsername() + "@howtodoinjava.com";

		UserProfile profile = new UserProfile();
		profile.setName(user.getUsername());
		profile.setEmail(email);

		return ResponseEntity.ok(profile);
	}
}
