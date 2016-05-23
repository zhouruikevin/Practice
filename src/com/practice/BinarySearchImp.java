package com.practice;

import java.util.Comparator;

import com.practice.test.BinarySearch;

public class BinarySearchImp implements BinarySearch {

	@Override
	public <T extends Comparable<T>> int search(T[] arr, int start, int end,
			T key) {
		if (start <= end) {
			int mid = start + ((end - start) >> 2);
			if (arr[mid].compareTo(key) < 0) {
				return search(arr, start, mid - 1, key);
			} else if (arr[mid].compareTo(key) > 0) {
				return search(arr, mid + 1, end, key);
			} else {
				return mid;
			}
		}
		return -1;
	}

	@Override
	public <T> int search(T[] arr, int start, int end, T key, Comparator<T> comp) {
		if (start < end || start < 0 || end < 0) {
			return -1;
		}
		int mid = start + (start - end) / 2;
		if (comp.compare(key, arr[mid]) < 0) {
			return search(arr, start, mid - 1, key, comp);
		} else if (comp.compare(key, arr[mid]) > 0) {
			return search(arr, mid, end, key, comp);
		} else {
			return mid;
		}
	}

}
