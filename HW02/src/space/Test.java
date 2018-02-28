
/* *********************************************************************************
 * Program Name:		ClassTester.java
 * Date Created:		February 25th, 2018
 * Author(s): 			Marianne Goldin, Jes Restad
 * Title: 				HW02
 * Description: 		Tests classes
 * Last Updated: 		February 27th, 2018 
 * ********************************************************************************* */

package space;

public class Test {

	public static void main (String[] args) {
		Person person1 = new Person("Jes", 37, 52.6);
		Person person2 = new Person("Marianne", 35, 155);
		Person person3 = new Person("Hayden", 25, 215);
		Planet merc = new Planet("Mercury", SunDistance.MERCURY, EarthDays.MERCURY, Mass.MERCURY, Radius.MERCURY); //changed the method calls to the variables
		Astronaut a1 = new Astronaut(person1, "Commander", merc);
		Astronaut a2 = new Astronaut(person2, "Pilot", merc);
		Astronaut a3 = new Astronaut(person3, "Specialist", merc);
		SpaceCraft sc1 = new SpaceCraft(a1, a2, a3, merc);
		
		//print Diagnostic
		System.out.println(sc1.showDiagnostics(person1, person2, person3));
			
	}


}