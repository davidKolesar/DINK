package com.mycompany.dao;

import java.util.List;

import com.mycomany.dto.Profile;

/**
 * Interface for profile DAO
 * 
 * @author David Kolesar
 */
public interface ProfileDAO {

	public Profile create();

	public Profile read(String id);

	public void update(Profile profile);

	public void delete(Profile profile);

	public List<Profile> getAll();

}