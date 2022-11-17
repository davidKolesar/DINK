package com.mycompany.domain;

import java.util.ArrayList;
import java.util.stream.Stream;

import com.google.common.base.Optional;
import com.mycomany.dto.Preferences;
import com.mycomany.dto.Profile;

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
	public ArrayList<Profile> determineWithinPreferences(Profile userProfile, ArrayList<Profile> allEligibleProfiles) {
		
		ArrayList<Preferences> userPreferences = userProfile.preferences;
		
		//within distance range 

		//all within desired gender (should this be last?)
		Stream<Profile> genderMatchingProfiles = allEligibleProfiles.stream().filter(p -> p.gender == userProfile.genderSeeking);
		
		//within age range 
		Stream<Profile> ageMatchingProfiles = genderMatchingProfiles.filter(p -> p.getAge() <= userProfile.getPreferredMaxAge() && p.getAge() >= userProfile.getPreferredMinAge());
		

		return allEligibleProfiles;
	}

}
