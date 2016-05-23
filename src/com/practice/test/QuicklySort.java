package com.practice.test;

import java.util.Comparator;

public class QuicklySort implements Sorter {

	@Override
	public <T extends Comparable<T>> void sort(T[] arr) {
		sort(arr, 0, arr.length - 1);
	}

	@Override
	public <T> void sort(T[] arr, Comparator<T> comp) {
		sort(arr, 0, arr.length - 1, comp);
	}

	private <T extends Comparable<T>> void sort(T[] arr, int s, int e) {
		if (e <= s || s < 0 || e < 0) {
			return;
		}
		int mid = findmid(arr, s, e);
		sort(arr, s, mid - 1);
		sort(arr, mid + 1, e);
	}

	private <T extends Comparable<T>> int findmid(T[] arr, int s, int e) {
		int start = s, end = e;
		T temp = arr[start];
		while (start < end) {
			while (arr[end].compareTo(temp) >= 0 && start < end) {
				end--;
			}
			arr[start] = arr[end];
			while (arr[start].compareTo(temp) <= 0 && start < end) {
				start++;
			}
			arr[end] = arr[start];
		}
		arr[start] = temp;
		return start;
	}

	private <T> void sort(T[] arr, int s, int e, Comparator<T> comp) {
		if (e <= s || s < 0 || e < 0) {
			return;
		}
		int mid = findmid(arr, s, e, comp);
		sort(arr, s, mid - 1, comp);
		sort(arr, mid + 1, e, comp);
	}

	private <T> int findmid(T[] arr, int s, int e, Comparator<T> comp) {
		int start = s, end = e;
		T temp = arr[s];
		while (start < end) {
			while (comp.compare(arr[end], temp) >= 0 && start < end) {
				end--;
			}
			arr[start] = arr[end];
			while (comp.compare(arr[start], temp) <= 0 && start < end) {
				start++;
			}
			arr[end] = arr[start];
		}
		arr[start] = temp;
		return start;
	}

}
