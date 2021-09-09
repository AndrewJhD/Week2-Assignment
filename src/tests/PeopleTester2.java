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


public class PeopleTester2 {

	String name = "Angel";
	int age = 14;
	People people = new People(name, age);
	
	@Before
	public void setUp() throws Exception{
	}
	
	@Test
	public void testingUnder18() {
		assertTrue(people.inSchoolAge());
	}
	
	@Test
	public void testingElderlyBenifits() {
		assertFalse(people.elderlyBenifits());
	}
	
	@Test
	public void testingPublicProfile() {
		String personProfile = "Angel, 14";
		assertEquals(personProfile,people.peopleProfile());
	}

}
