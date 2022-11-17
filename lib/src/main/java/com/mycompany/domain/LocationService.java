package com.mycompany.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author David Kolesar 16NOV22
 */
public class LocationService {
	
	private void addToLocationMap(String name, double latitude, double longitude, Map<String, List<Double>> locations) {
		List<Double> coordinates = new ArrayList<>();

		coordinates.add(latitude);
		coordinates.add(longitude);
		locations.put(name, coordinates);
	}	

}
