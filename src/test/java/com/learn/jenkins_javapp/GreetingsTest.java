package com.learn.jenkins_javapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GreetingsTest {

	private  Greetings  greetings;
	@BeforeEach
	void setUp() throws Exception {
		greetings=new Greetings();
	}

	@AfterEach
	void tearDown() throws Exception {
		greetings=null;
	}

	@Test
	void testGreet() {
		String message ="Have a Happy & Healthy Day";
		assertEquals(message, greetings.greet());
 	}

}
