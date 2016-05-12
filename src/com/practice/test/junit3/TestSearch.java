package com.practice.test.junit3;

import com.practice.control.SearchSolution;

import junit.framework.TestCase;

public class TestSearch extends TestCase {

	SearchSolution ss;

	@Override
	protected void setUp() throws Exception {
		ss = new SearchSolution();
		super.setUp();
	}

	public void testPermutation() {
		ss.Permutation("abc");
	}

}
