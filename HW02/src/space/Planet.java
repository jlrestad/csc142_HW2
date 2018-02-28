/* *********************************************************************************
 * Program Name:		Planet.java
 * Date Created:		February 19th, 2018
 * Author(s): 			Marianne Goldin
 * Title: 				HW02
 * Description: 		Calculate and print out planet info.
 * Last Updated: 		February 19th, 2018 
 * ********************************************************************************* */
package space;
import java.text.DecimalFormat;

public class Planet {
	private double distanceFromSun;//m
	private double planetEarthDays;
	private String name;
	private double mass; //kg
	private double radius; //m
	
	private final double G = 6.67*Math.pow(10, -11); // gravitational constant
	private final double LIGHT_SPEED = 2.99792458*Math.pow(10, 8); // m/s
	private final double PI = 3.14159265359;
	private final double TO_MILES = 1609.344; // (m/1609.344)
	private final double TO_MINUTES = 60.0; // (seconds/60.0)
	private final double TO_DAYS = 24.0; // (hours/24.0)
	
	//main constructor 
	public Planet() {
		this.name = null;
		this.distanceFromSun = 0;
		this.planetEarthDays = 0;
		this.mass = 0;
		this.radius = 0;
	}
	
	//overloaded constructor
	public Planet(String n, double s, double e, double m, double r) {
		this.name = n;
		this.distanceFromSun = s;
		this.planetEarthDays = e;
		this.mass = m;
		this.radius = r;
	}
	
	public double getDistanceFromSun() {
		return distanceFromSun / TO_MILES;  //meters to miles
	}
	
	public double getNoOfEarthDays() {
		return planetEarthDays;  
	}
	
	public String getName() {
		return name;
	}
	
	public double getMass() {
		return mass;  //kg
	}
	
	public double getRadius() {
		return radius / TO_MILES;  //mi
	}
	
	public double getFreeFall() {
		return ((G * mass) / (radius * radius));// m/s.s
	}
	
	public double getTimeForSunlight() {
		return (distanceFromSun/LIGHT_SPEED)/TO_MINUTES; // m / m/s = s / 60 = min
	}
	
	public double getSpeedOfOrbit() {
		return (((2*PI*distanceFromSun)/TO_MILES)/(planetEarthDays * TO_DAYS));  // ((2*PI*r)/T)  T=earth days to orbit sun
		// convert (m to mi)/(days to hrs) = mi/hr
	}
	
	public String getPlanetData() {
		DecimalFormat df = new DecimalFormat("0.00");
		return "----------------------" + "\nPlanet name: " + this.name + "\nPlanet Sun Distance: " + 
			this.distanceFromSun + " mi" + "\nPlanet Earth Days: " + this.planetEarthDays + " days" + 
			"\nPlanet mass: " + this.mass + " kg" + "\nPlanet Radius: " + this.radius + " mi" + "\nFree fall: " 
			+ df.format(getFreeFall()) + " m/s.s" + "\nTime for sunlight: " + df.format(getTimeForSunlight()) + 
			" min" + "\nSpeed of orbit: " + df.format(getSpeedOfOrbit()) + " mi/hr" + "\n------------------------\n";
	}

	
}
