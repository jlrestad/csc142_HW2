/* *********************************************************************************
 * Program Name:		SpaceCraft.java
 * Date Created:		February 24th, 2018
 * Author(s): 			Jes Restad
 * Title: 			HW02
 * Description: 		Creates SpaceCraft class and adds data - print commander, 
 * 				pilot, mission specialist, and planetary data
 * Last Updated: 		February 27th, 2018 
 * ********************************************************************************* */
package space;
import java.text.DecimalFormat;

public class SpaceCraft {
	
	private Astronaut commander;
	private Astronaut pilot;
	private Astronaut specialist;
	private Planet planet;
	
	
	DecimalFormat df = new DecimalFormat();
	
	public SpaceCraft() {
		this.commander = null;
		this.pilot = null;
		this.specialist = null;
		this.planet = null;
	}
	
	public SpaceCraft(Astronaut a1, Astronaut a2, Astronaut a3, Planet planet) {
		this.commander = a1;
		this.pilot = a2;
		this.specialist = a3;
		this.planet = planet;
	}
	
	public String showCommanderData(Person p1) {
//		return "COMMANDER" + "\nName: " + p1.getName() + "\nAge: " + df.format(commander.getPlanetaryAge()) + " yrs" +
//				"\nWeight: " + df.format(commander.getPlanetaryWeight()) + " lbs";
		return commander.getAstronautData(); 
	}
	
	public String showPilotData(Person p2) {
//		return  "PILOT" + "\nName: " + p2.getName() + "\nAge: " + df.format(pilot.getPlanetaryAge()) + " yrs" +
//				"\nWeight: " + df.format(pilot.getPlanetaryWeight()) + " lbs";
		return pilot.getAstronautData();
	}
	
	public String showSpecialistData(Person p3) {
//		return "SPECIALIST" + "\nName: " + p3.getName() + "\nAge: " + df.format(specialist.getPlanetaryAge()) + " yrs" +
//				"\nWeight: " + df.format(specialist.getPlanetaryWeight()) + " lbs";
		return specialist.getAstronautData();
	}

	public String showPlanetData() {
		return "Planet name: " + planet.getName() + "\nDistance from the sun: " + df.format(planet.getDistanceFromSun()) +
			" m" + "\nTravel around the sun: " + df.format(planet.getNoOfEarthDays()) + " Earth days" + 
			"\nPlanet mass: " + planet.getMass() + " kg" + "\nPlanet radius: " + df.format(planet.getRadius()) + " m";
	}
	
	//Team discuss efficient & logical way to best implement this method - discuss in report
	public String showDiagnostics(Person p1, Person p2, Person p3) { 
		return showCommanderData(p1) + "\n\n" + showPilotData(p2)
			+ "\n\n" + showSpecialistData(p3) + "\n\n" + showPlanetData();
	}
	
	
}


