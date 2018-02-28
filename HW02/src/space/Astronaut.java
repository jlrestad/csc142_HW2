/* *********************************************************************************
 * Program Name:		Astronaut.java
 * Date Created:		February 19th, 2018
 * Author(s): 			Marianne Goldin,Sophia "Hayden" Goodwin, Jes Restad
 * Title: 			HW02
 * Description: 		Creates Astronaut class and adds data 
 * Last Updated: 		February 27th, 2018 
 * ********************************************************************************* */
package space;
import java.text.DecimalFormat;

public class Astronaut {

	DecimalFormat df = new DecimalFormat("0.00");
	
	//placeholder for astronaut data
	//Marianne - age - 35 - weight - 155lb  / 70.30681735 kg
	//Jes - age:37 - weight:116lb/52.62kg
	//Hayden - age: 25, weight: 97.6kg

    private Person identity;
    private String role;
    private Planet planet;

    private static final double EARTH_DAYS = 365.25;
    private static final double EARTH_GRAVITY = 9.81; // m/s
    private static final double TO_NEWTONS = 4.448; // 1lb = 4.448N  lb*4.448=N
    private static final double TO_LBS = 4.448; // N/4.448=lbs
    
    //Constructors
    //Team discussion on best way to implement constructors - add to report
    public Astronaut(Person i, String r, Planet p) {
    	this.identity = i;
    	this.role = r;
    	this.planet = p;    	
    }
    
    public Astronaut(Person i, String r) {
    	this.identity = i;
    	this.role = r;
    }
    
    public Astronaut(Person i) {
    	this.identity = i;
    }

    //Methods
     public double getMass() {
    	return planet.getMass();
    }
    
    public double getMass(Planet p) {
    	return p.getFreeFall();
    	
    }
    
    public double getPlanetaryAge() {
    	return (identity.getAge() * EARTH_DAYS)/planet.getNoOfEarthDays(); 
    	//(age on Earth * 365)/Earth days planet takes to travel around sun
    }
    
    public double getPlanetaryWeight() {
    	double mass = ((identity.getWeight() * TO_NEWTONS ) / EARTH_GRAVITY) / TO_LBS // lbs / 9.81
    	return mass * planet.getFreeFall();
    	//mass * planet free fall
    }
    
    public String getAstronautData(String r) {
    	this.role = r;
    	return "Astronaut name: " + identity.getName() + "\nAstronaut role: " + this.role 
    		+ "\nEarth age: " + identity.getAge() + " yrs" + "\nEarth weight: " + 
    		identity.getWeight() + " lbs" + "\nDestination planet: " + this.planet.getName() 
    		+ "\nPlanet mass: " + getMass() + " kg" + "\nAstronaut age on planet: " + 
    		df.format(getPlanetaryAge()) + " yrs" + "\nAstronaut weight on planet: " + 
    		df.format(getPlanetaryWeight()) + " lbs";
    }
    
    public String getAstronautData() {
    	return this.getAstronautData(this.role); //overrides role
    }
}
