package com.example.model.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.beans.Profile;
import com.example.model.dao.ProfileRepo;

@Service
public class ProfileServiceImpl implements ProfileService{
	@Autowired
	private ProfileRepo profileDao;
	
	@Transactional
	@Override
	public Profile storeProfile(Profile profile) {
		Profile createdProfile = profileDao.save(profile);
		return createdProfile;
	}
	
	@Override
	public List<Profile> fetchProfile(){
		List<Profile> list = profileDao.findAll();
		return list;
	}
}
