package com.mycomany.dto;

import java.awt.Image;
import java.util.ArrayList;

public class Profile {

	public int id;
	public String name;
	//Enum location;
	//Coordinates coordinates gps tracing stuff;
	public int distance;
	public int age;
	public String job;
	public Gender gender;
	public genderSeeking gender;
	public ArrayList<Image> arrayName = new ArrayList<Image>();
	public boolean isVisible;
	public String profileInfo;
	public ArrayList<preferences> preferences;
	public ArrayList<Interests> interests;
	public ArrayList<Boolean> swipes;

	
	
	
}
