package com.example.model.beans;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Profile {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int profileId;
	private String name;
	private long phone;
	private LocalDate dob;
	
	public int getProfileId() {
		return profileId;
	}
	public String getName() {
		return name;
	}
	
	public long getPhone() {
		return phone;
	}
	
	public LocalDate getDate() {
		return dob;
	}
	
	public void setDate(LocalDate d) {
		dob=d;
	}
	
	
	public void setProfileId(int id) {
		profileId=id;
	}
	
	public void setName(String n) {
		name=n;
	}
	
	public void setPhone(long p) {
		phone=p;
	}
	
	
}
