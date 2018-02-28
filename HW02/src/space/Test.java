
/* *********************************************************************************
 * Program Name:		ClassTester.java
 * Date Created:		February 25th, 2018
 * Author(s): 			Marianne Goldin, Jes Restad
 * Title: 			HW02
 * Description: 		Tests classes
 * Last Updated: 		February 27th, 2018 
 * ********************************************************************************* */
package space;

public class Test {

	public static void main (String[] args) {
		Person person1 = new Person("Jes", 37, 52.6);
		Person person2 = new Person("Marianne", 35, 155);
		Person person3 = new Person("Hayden", 25, 215);
		
		Planet merc = new Planet("Mercury", SunDistance.MERCURY, EarthDays.MERCURY, Mass.MERCURY, Radius.MERCURY); //changed the method calls
		Planet ven = new Planet("Venus", SunDistance.VENUS, EarthDays.VENUS, Mass.VENUS, Radius.VENUS);
		Planet mars = new Planet("Mars", SunDistance.MARS, EarthDays.MARS, Mass.MARS, Radius.MARS);
		
		//TEST info -- shows planet info, changes roles
		Astronaut a1 = new Astronaut(person1, "Commander", merc);
		Astronaut a2 = new Astronaut(person2, "Pilot", merc);
		Astronaut a3 = new Astronaut(person3, "Specialist", merc);
		SpaceCraft sc1 = new SpaceCraft(a1, a2, a3, merc);
		
		Astronaut a4 = new Astronaut(person1, "Pilot", ven);
		Astronaut a5 = new Astronaut(person2, "Specialist", ven);
		Astronaut a6 = new Astronaut(person3, "Commander", ven);
		SpaceCraft sc2 = new SpaceCraft(a4, a5, a6, ven);
		
		Astronaut a7 = new Astronaut(person1, "Pilot", mars);
		Astronaut a8 = new Astronaut(person2, "Specialist", mars);
		Astronaut a9 = new Astronaut(person3, "Commander", mars);
		SpaceCraft sc3 = new SpaceCraft(a7, a8, a9, mars);
		
		//Print TEST 1
		System.out.println("TEST 1 \n" + sc1.showDiagnostics(person1, person2, person3) + "-----------------------\n");
		
		//Print TEST 2
		System.out.println("TEST 2 \n" + sc2.showDiagnostics(person1, person2, person3) + "-----------------------\n");
		
		//Print TEST 3
		System.out.println("TEST 3 \n" + sc3.showDiagnostics(person1, person2, person3) + "-----------------------\n");
			
	}


}
