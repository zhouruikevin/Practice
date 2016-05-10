package com.practice.test.junit3;

import com.practice.control.NumberSolution;

import junit.framework.TestCase;

public class TestNumber extends TestCase {
	public void testNumberOf1() {
		assertEquals(1, NumberSolution.NumberOf1(1));
		assertEquals(2, NumberSolution.NumberOf1(3));
		assertEquals(2, NumberSolution.NumberOf1(5));
		assertEquals(1, NumberSolution.NumberOf1(8));
	}
}
