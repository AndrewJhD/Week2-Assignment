/**
 * @author AndrewDowd - adowd1
 * CIS175 - Fall 2021
 * Sep 9, 2021
 */
package model;


public class People {
	
	private String name;
	private int age;	
	
	public People() {
		this.name = "";
		this.age = 0;
	}
	
	public People(String Name, int Age) {
		this.name = Name;
		this.age = Age;
	}
	
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String Name) {
		this.name = Name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int Age) {
		this.age = Age;
		
	}
	
	//1
	public boolean inSchoolAge() {
		if(age < 18) {
			return true;
		}
		else {
			return false;
		}
	}
	//2
	public String peopleProfile() {
		
		
		return name + ", " + age;
	}
	//3
	public boolean elderlyBenifits() {
		
		if(age >= 65) {
			return true;
		}
		else {
			return false;
		}
		
	}
}
