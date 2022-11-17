package com.mycompany.domain;

import java.util.ArrayList;

/**
 * Service that determines which profiles to display to a user
 * 
 * @author David Kolesar 16NOV22
 */
public class DatingPoolService {

	/**
	 * @param allEligibleProfiles Determines all potential profiles within eligible
	 *                            distance
	 * @return <ArrayList>
	 */
	public ArrayList determineWithinDistance(ArrayList allEligibleProfiles) {
		// Is there a smart way to sort by region? Maybe sort by state? What about
		// living near edge of state?
		return allEligibleProfiles;
	}

	/**
	 * @param allEligibleProfiles Determines all potential profiles within user set
	 *                            preferences
	 * @return <ArrayList>
	 */
	public ArrayList determineWithinPreferences(ArrayList allEligibleProfiles) {

		return allEligibleProfiles;
	}

}
