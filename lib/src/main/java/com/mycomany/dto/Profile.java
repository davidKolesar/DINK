package com.mycomany.dto;

import java.awt.Image;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public class Profile {
	String id = UUID.randomUUID().toString(); // or do we want SQL to create the id?
	public String name;
	// Coordinates coordinates gps tracking stuff;
	private int distance;
	public LocalDate birthday;
	private int age;
	public String job;
	public Gender gender;
	public Gender genderSeeking;
	private ArrayList<Image> photos = new ArrayList<Image>();
	public boolean isVisible;
	public String profileInfo;
	public ArrayList<Preferences> preferences;
	public ArrayList<Interests> interests;
	public ArrayList<Boolean> swipes;
	private boolean isLiked;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Gender getGenderSeeking() {
		return genderSeeking;
	}

	public void setGenderSeeking(Gender genderSeeking) {
		this.genderSeeking = genderSeeking;
	}

	public ArrayList<Image> getPhotos() {
		return photos;
	}

	public void setPhotos(ArrayList<Image> photos) {
		this.photos = photos;
	}

	public boolean isVisible() {
		return isVisible;
	}

	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}

	public String getProfileInfo() {
		return profileInfo;
	}

	public void setProfileInfo(String profileInfo) {
		this.profileInfo = profileInfo;
	}

	public ArrayList<Preferences> getPreferences() {
		return preferences;
	}

	public void setPreferences(ArrayList<Preferences> preferences) {
		this.preferences = preferences;
	}

	public ArrayList<Interests> getInterests() {
		return interests;
	}

	public void setInterests(ArrayList<Interests> interests) {
		this.interests = interests;
	}

	public boolean isLiked() {
		return isLiked;
	}

	public void setLiked(boolean isLiked) {
		this.isLiked = isLiked;
	}
}
