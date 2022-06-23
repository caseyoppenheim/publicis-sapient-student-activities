package com.example.model.service;
import java.util.List;
import com.example.model.beans.Profile;
public interface ProfileService {
	public Profile storeProfile(Profile progfile);
	public List<Profile> fetchProfile();
}
