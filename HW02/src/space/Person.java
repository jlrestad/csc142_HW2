/* *********************************************************************************
 * Program Name:		Person.java
 * Date Created:		February 16th, 2018
 * Author(s): 			Jes Restad
 * Title: 			HW02
 * Description: 		Stores name, age, and weight of a person.
 * Last Updated: 		February 27th, 2018 
 * ********************************************************************************* */
package space;

public class Person {
	
	private String name;
	private double age;
	private double weight;
	
	public Person() {
		name = null;
		this.age = 0.0;
		this.weight = 0.0;
	}
	
	public Person(String name, double age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	
	public double getAge() {
		return age;
	}
	
	public double getWeight() {
		return weight;
	}
	
}
