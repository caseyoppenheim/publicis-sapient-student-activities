package com.example.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.model.beans.Profile;
public interface ProfileRepo extends JpaRepository<Profile, Integer> {
	public Profile save(Profile profile);
	
	public List<Profile> findAll();
	
	
	
}
