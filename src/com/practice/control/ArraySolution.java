package com.practice.control;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ArraySolution {
	// 8行8列
	public final static int MAX = 8;
	/** 存储总共有多少种解法 */
	public static int count = 0;
	// 从1开始计数，存储1表示这个位置是一个合法位置，0表示不是一个合法位置。因为种解法每一行只有一个1，第0列用来存储只有一个1的坐标位置
	private int[][] matrix = new int[MAX + 1][MAX + 1];

	/**
	 * 判断坐标(i,j)是不是一个可用位置
	 */
	public boolean isLegal(int j, int i) {
		for (int m = 1; m < j; m++) {
			int n = matrix[m][0];
			if (n == i || Math.abs(i - n) == Math.abs(j - m)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 打印解法
	 */
	public void printMatrix() {
		count++;
		System.out.println("NO." + count);
		for (int i = 1; i <= MAX; i++) {
			for (int j = 1; j <= MAX; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}

	/**
	 * 填充棋子
	 */
	public void fill(int i) {
		if (i > MAX) {
			printMatrix();
		} else {
			for (int m = 1; m <= MAX; m++) {
				matrix[i][m] = 1;
				if (isLegal(i, m)) {
					matrix[i][0] = m;
					fill(i + 1);
				}
				matrix[i][m] = 0;
			}
		}
	}

	public int MoreThanHalfNum_Solution(int[] array) {
		if (array == null || array.length == 0) {
			return 0;
		}
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < array.length; i++) {
			Integer count = map.get(array[i]);
			if (count == null) {
				count = 1;
			} else {
				count += 1;
			}
			map.put(array[i], count);
			if (count > array.length / 2) {
				return array[i];
			}
		}
		return 0;
	}

	private boolean[] has;
	private char[] result;
	private HashSet<String> set = new HashSet<String>();

	private void fillChar(char[] chars, int n) {
		if (n >= chars.length) {
			set.add(new String(result));
			return;
		}
		for (int i = 0; i < chars.length; i++) {
			if (!has[i]) {
				result[n] = chars[i];
				has[i] = true;
				fillChar(chars, n + 1);
				has[i] = false;
			}
		}
	}

	public ArrayList<String> Permutation(String str) {
		ArrayList<String> list = new ArrayList<String>();
		int length = str.length();
		if (str == null || length == 0) {
			return list;
		}
		has = new boolean[length];
		result = new char[length];
		char[] chars = str.toCharArray();
		fillChar(chars, 0);
		list.addAll(set);
		Collections.sort(list);
		return list;
	}

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
