package com.practice.control.sort;

public class MergeSort {
	public static void merge(int[] arr) {
		merge(arr, 0, arr.length - 1);
	}

	private static void merge(int[] arr, int start, int end) {
		if (end <= start) {
			return;
		}
		int mid = (end - start) / 2 + start;
		merge(arr, start, mid);
		merge(arr, mid + 1, end);
		mergeSort(arr, start, mid, end);
	}

	private static void mergeSort(int[] arr, int start, int mid, int end) {
		int[] helper = new int[arr.length];
		for (int k = start; k <= end; k++) {
			helper[k] = arr[k];
		}
		int i = start, j = mid + 1;
		for (int k = start; k <= end; k++) {
			if (i > mid) {
				arr[k] = helper[j];
				j++;
			} else if (j > end) {
				arr[k] = helper[i];
				i++;
			} else if (helper[i] < helper[j]) {
				arr[k] = helper[i];
				i++;
			} else {
				arr[k] = helper[j];
				j++;
			}
		}
	}
}
