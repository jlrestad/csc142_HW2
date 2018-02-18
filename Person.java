/* *********************************************************************************
 * Program Name:		Person.java
 * Date Created:		February 16th, 2018
 * Author(s): 			Jes Restad
 * Title: 				HW02
 * Description: 		Lists constants for the planet distances from the sun.
 * Last Updated: 		February 16th, 2018 
 * ********************************************************************************* */
package space;

public class Person {
	
	private String name;
	private double age;
	private double weight;
	
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
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(double age) {
		this.age = age;
	
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	//..For Testing...
//	public String newPerson() {
//		return "Person name: " + this.getName() + "\nPerson age: " + this.getAge() + "\nPerson weight: " + this.getWeight();
//	}
	
}
