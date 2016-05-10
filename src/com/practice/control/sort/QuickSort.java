package com.practice.control.sort;

public class QuickSort {

	public static void quick(int[] arr) {
		quick(arr, 0, arr.length - 1);
	}

	private static void quick(int[] arr, int low, int high) {
		if (low < high) {
			int mid = quickSort(arr, low, high);
			quick(arr, low, mid);
			quick(arr, mid + 1, high);
		}
	}

	public static int quickSort(int[] arr, int low, int high) {
		int result = arr[low];
		int i = low, j = high;
		while (i < j) {
			while (i < j && result <= arr[j]) {
				j--;
			}
			if (i < j) {
				arr[i] = arr[j];
			}
			while (i < j && result >= arr[i]) {
				i++;
			}
			if (i < j) {
				arr[j] = arr[i];
			}
		}

		arr[i] = result;
		return i;
	}

}
