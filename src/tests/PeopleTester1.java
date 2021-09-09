/**
 * @author AndrewDowd - adowd1
 * CIS175 - Fall 2021
 * Sep 9, 2021
 */
package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.People;


public class PeopleTester1 {
	String name = "Robert";
	int age = 65;
	People people = new People(name, age);
	
	@Before
	public void setUp() throws Exception{
	}
	
	@Test
	public void testingUnder18() {
		assertFalse(people.inSchoolAge());
	}
	
	@Test
	public void testingElderlyBenifits() {
		assertTrue(people.elderlyBenifits());
	}
	
	@Test
	public void testingPublicProfile() {
		String personProfile = "Robert, 65";
		assertEquals(personProfile,people.peopleProfile());
	}

}
