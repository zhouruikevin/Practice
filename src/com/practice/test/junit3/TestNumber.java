package com.practice.test.junit3;

import java.util.ArrayList;

import junit.framework.TestCase;

import com.practice.control.NumberSolution;

public class TestNumber extends TestCase {

	// public void testNumberOf1() {
	// assertEquals(1, NumberSolution.NumberOf1(1));
	// assertEquals(2, NumberSolution.NumberOf1(3));
	// assertEquals(2, NumberSolution.NumberOf1(5));
	// assertEquals(1, NumberSolution.NumberOf1(8));
	// }

	private NumberSolution solution;
	// private int[] array = { 1, 6, 5, 6, 1, 2, 3, 4 };
	private ArrayList<Integer> aMin2;
	private ArrayList<Integer> aMin3;
	private ArrayList<Integer> aMin4;
	// aMin2 = new ArrayList<Integer>();
	// aMin2.add(1);
	// aMin2.add(1);
	// aMin3 = new ArrayList<Integer>(aMin2);
	// aMin3.add(2);
	// aMin4 = new ArrayList<Integer>(aMin3);
	// aMin4.add(3);
	private int[] array = { 3, 32, 321 };
	private String result = "321323";

	@Override
	protected void setUp() throws Exception {
		solution = new NumberSolution();
		super.setUp();

	}

	public void testGetNumberOfK() {

		String s1 = "Programming";
		String s2 = new String("Programming");
		String s3 = "Program" + "ming";
		System.out.println(s1.toString() == s2.toString());
		System.out.println(s1 == s3);
		System.out.println(s1 == s1.intern());
	}
	// public void testPrintMinNumber() {
	// assertEquals(result, solution.PrintMinNumber(array));
	// }
	//
	// public void testNumberOf1Between1AndN_Solution() {
	// assertEquals(6, solution.NumberOf1Between1AndN_Solution(13));
	// }
	//
	// public void testGetLeastNumbers_Solution() {
	// assertEquals(aMin2, solution.GetLeastNumbers_Solution(array, 2));
	// assertEquals(aMin3, solution.GetLeastNumbers_Solution(array, 3));
	// assertEquals(aMin4, solution.GetLeastNumbers_Solution(array, 4));
	// }
}
