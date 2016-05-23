package com.practice.test;
import java.util.Comparator;

public interface Sorter {
	/**
	 * 待排序数据需要实现Comparable接口
	 */
	<T extends Comparable<T>> void sort(T[] arr);

	/**
	 * @param arr
	 *            待排序数组
	 * @param comp
	 *            实现比较器
	 */
	<T> void sort(T[] arr, Comparator<T> comp);
}
