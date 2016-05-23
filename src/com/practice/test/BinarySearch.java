package com.practice.test;

import java.util.Comparator;

public interface BinarySearch {
	<T extends Comparable<T>> int search(T[] arr, int start, int end, T key);

	<T> int search(T[] arr, int start, int end, T key, Comparator<T> comp);
}
