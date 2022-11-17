package com.mycompany.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.mycompany.dto.Preferences;
import com.mycompany.dto.Profile;

/**
 * Service that determines which profiles to display to a user
 * 
 * @author David Kolesar 16NOV22
 */
public class DatingPoolService {

	/**
	 * Culls list of matches to those within distance preferences
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
	 * Filters out available matches based on preferences
	 * @param allEligibleProfiles Determines all potential profiles within user set
	 *                            preferences
	 * @return <ArrayList>
	 */
	public List<Profile> determineWithinPreferences(Profile userProfile, ArrayList<Profile> allEligibleProfiles) {
		
		ArrayList<Preferences> userPreferences = userProfile.preferences;
		
		//should we do this as one long stream? it would be if height, search, etc
		
		//all within desired gender (should this be last?)
		Stream<Profile> genderMatchingProfiles = allEligibleProfiles.stream().filter(p -> p.gender == userProfile.genderSeeking);
		
		//within age range 
		Stream<Profile> ageMatchingProfiles = genderMatchingProfiles.filter(p -> p.getAge() <= userProfile.getPreferredMaxAge() && p.getAge() >= userProfile.getPreferredMinAge());
		
		//within height 
		Stream<Profile> heightMatchingProfiles = ageMatchingProfiles.filter(p -> p.getHeight() <= userProfile.getPreferredMaxAge() && p.getAge() >= userProfile.getPreferredMinAge());

		//within days last active
		Stream<Profile> lastActiveMatchingProfiles = heightMatchingProfiles.filter(p -> p.getDaysSinceLastActive() <= userProfile.getPreferredLastActive());
		
		return lastActiveMatchingProfiles.toList();
	}
	
	/**
	 * Presents user will all matches available within preferences filter
	 * @param allEligibleProfiles Determines all potential profiles within user set
	 *                            preferences
	 * @return <ArrayList>
	 */
	public List<Profile> presentMatchQueue (Profile userProfile, ArrayList<Profile> allEligibleProfiles) {
		
		//does this even belong here
		for(Profile profile : allEligibleProfiles) {
			userProfile.swipes.add(allEligibleProfiles);
		}
	}
	
}
