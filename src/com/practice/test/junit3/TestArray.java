package com.practice.test.junit3;

import com.practice.control.ArraySolution;

import junit.framework.TestCase;

public class TestArray extends TestCase {

	private ArraySolution solution;

	@Override
	protected void setUp() throws Exception {
		solution = new ArraySolution();
		super.setUp();
	}

	public void testPermutation() {
		assertEquals(6, solution.Permutation("abc").size());
	}

	public void testMoreThanHalfNum_Solution() {
		int[] array = { 1, 2, 3, 2, 2, 2, 5, 4, 2 };
		assertEquals(2, solution.MoreThanHalfNum_Solution(array));
	}

}
