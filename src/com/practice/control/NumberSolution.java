package com.practice.control;

public class NumberSolution {
	public static int NumberOf1(int n) {
		String binaNStr = Integer.toBinaryString(n).replaceAll("0", "");
		return binaNStr.length();
	}

	public double Power(double base, int exponent) {
		return Math.pow(base, exponent);
	}
}
