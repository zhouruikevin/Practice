package com.practice.control;

public class ArraySolution {
	public static String Find(int[][] array, int target) {
		int size = array.length - 1;
		int i = 0;
		while (i < array[0].length && size >= 0) {
			if (array[size][i] > target) {
				size--;
			} else if (array[size][i] < target) {
				i++;
			} else {
				return size + "," + i;
			}
		}
		return "";
	}
}
