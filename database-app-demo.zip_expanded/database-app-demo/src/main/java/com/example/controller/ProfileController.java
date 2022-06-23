package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.beans.Profile;
import com.example.model.service.ProfileService;

@RestController
@RequestMapping("/profile")
public class ProfileController {
	@Autowired
	private ProfileService profileService;
	
	@PostMapping
	public ResponseEntity<Object> store(@RequestBody Profile profile){
		Profile storedProfile = profileService.storeProfile(profile);
		return ResponseEntity.status(HttpStatus.CREATED).body(storedProfile);
	}
}
