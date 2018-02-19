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

//define and print out planet
public class Planet {
	
	private double distanceFromSun;//value in m
	private double planetEarthDays;
	private String name;
	private double mass;//value in kg
	private double radius;//value in m
	
	//value constants
	private final double G = 6.67 * Math.pow(10,-11); //gravitational constant
	private final double LIGHT_SPEED = 2.99792458 * Math.pow(10,8); // speed of light in m/s
	private final double PI = 3.14159265359; // PI, accurate to the 11th decimal pt
	private final double TO_MILES = 1609.344; //conversion constant from meters to miles, using division
	private final double TO_MINUTES = 60.0; //conversion constant from sec to min, using division
	private final double TO_DAYS = 24.0; //conversion constant from hrs to days, using division
	
	//Planet constructor
	public Planet (double d, double pED, 
			String n, double m, double r) {
		this.distanceFromSun = d;
		this.planetEarthDays = pED;
		this.name = n;
		this.mass = m;
		this.radius = r;
	}
	
	//access data
	public double getDistanceFromSun() {
		return distanceFromSun / TO_MILES; //converts from meters to miles
	}
	
	public double getNoOfEarthDays() {
		return planetEarthDays; 
	}
	
	public String getName() {
		return name;
	}
	
	public double getMass() {
		return mass; //in kg
	}
	
	public double getRadius() {
		return radius / TO_MILES; //converts from meters to miles
	}
	
	//get calculated aspects
	public double getFreeFall(double m, double r) {
		return ((G * m) / (r * r));//freefall acceleration (m/s.s)
		//Q: Is this a correct return value for unit m/s.s?
	}
	
	/* 
	 public double getTimeForSunlight(double dm) {
	 
	 	return dm / LIGHT_SPEED; //distance from sun (meters) / light speed (meter per second) 
	 							//time for sunlight to reach the destination planet in mins
		
			Q: Formula is not defined in HW conversions, should we assume this is: ??
					Distance from sun (in meters) / Light speed (in meters)
					ref: https://phys.org/news/2013-04-sunlight-earth.html
	}
	*/
	
	public double getSpeedofOrbit(double r, double p) {
		return (2 * PI * (r / TO_MILES)) / (p * TO_DAYS );   //approx orbital speed in miles/hr
	}
	
	//print planet data, formatted to two decimal places
	public String getPlanetData() {
		DecimalFormat df = new DecimalFormat("0.00");
		return "+---------Planet Data---------+\n"+
				"Name: " + name + "\n"+
				"Free fall acceleration (m/s.s): " + this.getName() + "\n"+
				"Mass (kg): " + df.format(this.getMass()) + "\n"+
				"Radius (miles): " + df.format(this.getRadius()) + "\n"+
				"Distance from sun (miles): " + df.format(this.getDistanceFromSun()) + "\n"+
				"Number of days to orbit Sun (Earth days): " + df.format(this.getNoOfEarthDays()) + "\n"+
				"Time for sunlight (minutes): " + "TBD" + "\n"+
				"+----------------------------+";
	}
}
