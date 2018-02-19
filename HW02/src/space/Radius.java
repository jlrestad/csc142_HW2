/* *********************************************************************************
 * Program Name:		Radius.java
 * Date Created:		February 17th, 2018
 * Author(s): 			Marianne Goldin
 * Title: 				HW02
 * Description: 		Lists constants for planet radii in m.
 * Last Updated: 		February 18th, 2018 
 * ********************************************************************************* */

package space;

//planet mean radii in m
public class Radius {
	public final double MERCURY = 2.43 * Math.pow(10,5);
	public final double VENUS = 6.06 * Math.pow(10,5);
	public final double EARTH = 6.37 * Math.pow(10,5);
	public final double MARS = 3.37 * Math.pow(10,5);
	public final double JUPITER = 6.99* Math.pow(10,7);
	public final double SATURN = 5.85 * Math.pow(10,7);
	public final double URANUS = 2.33 * Math.pow(10,7);
	public final double NEPTUNE = 2.21 * Math.pow(10,7);
	
		
	public double getRadiusMercury() {
		return MERCURY;
	}
	
	public double getRadiusVenus() {
		return VENUS;
	}
	
	public double getRadiusEarth() {
		return EARTH;
	}
	
	public double getRadiusMars() {
		return MARS;
	}
	
	public double getRadiusJupiter() {
		return JUPITER;
	}
	
	public double getRadiusSaturn() {
		return SATURN;
	}
	
	public double getRadiusUranus() {
		return URANUS;
	}
	
	public double getRadiusNeptune() {
		return NEPTUNE;
	}
	


}
