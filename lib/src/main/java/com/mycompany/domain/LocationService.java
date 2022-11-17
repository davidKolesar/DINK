package com.mycompany.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author David Kolesar 16NOV22
 */
public class LocationService {
	
	private void addToLocationMap(String name, double lat, double lng, Map<String, List<Double>> locations) {
		List<Double> coordinates = new ArrayList<>();

		coordinates.add(lat);
		coordinates.add(lng);
		locations.put(name, coordinates);
	}	
	
}
