package com.cg.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class squareTest {

	@Test
	void test() {
		JunitTesting test= new JunitTesting();
		int output= test.square(5);
		assertEquals(26, output);
	}
	
	@Test
	void countTest() {
		JunitTesting test= new JunitTesting();
		int output= test.countA("alphaabet");
		assertEquals(3, output, "Expecting only 2 a's ");
	}

}
