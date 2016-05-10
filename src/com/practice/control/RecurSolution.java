package com.practice.control;

public class RecurSolution {
	public static int RectCover(int target) {
		if (target <= 0) {
			return 0;
		} else if (target <= 2) {
			return target;
		} else {
			return RectCover(target - 1) + RectCover(target - 2);
		}
	}

	public String replaceSpace(StringBuffer str) {
		return str.toString().replaceAll("\\s", "%20");
	}

	public int Fibonacci(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		int i = 1;
		int result = 0;
		int preNum = 1;
		int pPreNum = 0;
		while (result < n) {
			result = pPreNum + preNum;
			pPreNum = preNum;
			preNum = result;
			i++;
			if (result == n) {
				return i;
			}
		}
		return -1;
	}
}
