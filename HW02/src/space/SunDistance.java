/* *********************************************************************************
 * Program Name:		SunDistance.java
 * Date Created:		February 16th, 2018
 * Author(s): 			Jes Restad
 * Title: 				HW02
 * Description: 		Lists constants for the planet distances from the sun.
 * Last Updated: 		February 18th, 2018 
 * ********************************************************************************* */
package space;

//planet distances from the sun in m
public class SunDistance {  
	public final double MERCURY = 5.79*Math.pow(10, 10);
	public final double VENUS = 1.08*Math.pow(10, 11);
	public final double EARTH = 1.50*Math.pow(10, 11);
	public final double MARS = 2.28*Math.pow(10, 11);
	public final double JUPITER = 7.78*Math.pow(10, 11);
	public final double SATURN = 1.43*Math.pow(10, 12);
	public final double URANUS = 2.87*Math.pow(10, 12);
	public final double NEPTUNE = 4.50*Math.pow(10,12);
	
	public double getDistanceMercury() {
		return MERCURY;
	}
	
	public double getDistanceVenus() {
		return VENUS;
	}
	
	public double getDistanceEarth() {
		return EARTH;
	}
	
	public double getDistanceMars() {
		return MARS;
	}
	
	public double getDistanceJupiter() {
		return JUPITER;
	}
	
	public double getDistanceSaturn() {
		return SATURN;
	}
	
	public double getDistanceUranus() {
		return URANUS;
	}
	
	public double getDistanceNeptune() {
		return NEPTUNE;
	}
		

	
}
