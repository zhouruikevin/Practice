package com.practice.control;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import android.text.InputFilter.LengthFilter;

public class NumberSolution {
	public static int NumberOf1(int n) {
		String binaNStr = Integer.toBinaryString(n).replaceAll("0", "");
		return binaNStr.length();
	}

	public double Power(double base, int exponent) {
		return Math.pow(base, exponent);
	}

	public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (input == null || input.length < k || k <= 0) {
			return list;
		}
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < input.length - i - 1; j++) {
				if (input[j] < input[j + 1]) {
					int temp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = temp;
				}
			}
			list.add(input[input.length - i - 1]);
		}
		return list;
	}

	public String PrintMinNumber(int[] numbers) {
		if (numbers == null || numbers.length == 0) {
			return "";
		}
		int length = numbers.length;
		String[] numStrs = new String[length];
		for (int i = 0; i < length; i++) {
			numStrs[i] = numbers[i] + "";
		}
		Arrays.sort(numStrs, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				String total1 = s1 + s2;
				String total2 = s2 + s1;
				return total1.compareTo(total2);
			}
		});
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < length; i++) {
			sb.append(numStrs[i]);
		}
		return sb.toString();
	}

	public int getFirst(int[] array, int s, int e, int k) {
		if (s >= e) {
			return array[e] == k ? e : -1;
		}
		int mid = (s + e) / 2;
		if (array[mid] < k) {
			return getFirst(array, mid + 1, e, k);
		} else {
			return getFirst(array, s, mid, k);
		}
	}

	public int getEnd(int[] array, int s, int e, int k) {
		if (s >= e) {
			return array[s] == k ? s : -1;

		}
		int mid = (s + e) / 2;
		if (array[mid] <= k) {
			return getEnd(array, mid, e, k);
		} else {
			return getEnd(array, s, mid - 1, k);
		}
	}

	public int GetNumberOfK(int[] array, int k) {
		if (array == null || array.length == 0) {
			return 0;
		}
		if (array[0] > k || array[array.length - 1] < k) {
			return 0;
		}
		int first = getFirst(array, 0, array.length - 1, k);
		int end = getEnd(array, 0, array.length - 1, k);
		return end - first + 1;
	}

	public int NumberOf1Between1AndN_Solution(int n) {
		int count = 0;
		for (int i = 0; i <= n; i++) {
			String str = i + "";
			char[] chars = str.toCharArray();
			for (int j = 0; j < chars.length; j++) {
				if (chars[j] == '1') {
					count++;
				}
			}
		}
		return count;
	}
}
