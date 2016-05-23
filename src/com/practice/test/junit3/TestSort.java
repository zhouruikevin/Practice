package com.practice.test.junit3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import junit.framework.TestCase;

import org.kymjs.kjframe.utils.L;

import com.practice.BinarySearchImp;
import com.practice.test.QuicklySort;

public class TestSort extends TestCase {

	private Integer[] arr = { 2, 5, 4, 10, 3 };
	private QuicklySort sorter;
	private BinarySearchImp search;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		sorter = new QuicklySort();
		search = new BinarySearchImp();
	}

	public void testJava() throws Exception {
		super.setUp();
		Integer[] arr = { 2, 5, 4, 10, 3 };
		// 升序
		Arrays.sort(arr);
		// 降序
		Arrays.sort(arr, new Comparator<Integer>() {
			@Override
			public int compare(Integer lhs, Integer rhs) {
				return rhs - lhs;
			}
		});
		// 查找
		int location = Arrays.binarySearch(arr, 10);
		/** ------------------------- 集合操作 --------------------------- */
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
		// 排序
		Collections.sort(list);
		// 查找
		Collections.binarySearch(list, 10);
		Set<Integer> set = new TreeSet<Integer>(list);

	}

	public void testBinaryS1() {
		int a = search.search(arr, 0, arr.length - 1, 10);
		int b = Arrays.binarySearch(arr, 10);
		L.d(a);
		// assertEquals(a, b);
	}

	// PUBLIC VOID TESTBINARYS1() {
	// INT A = SEARCH.SEARCH(ARR, 0, ARR.LENGTH - 1, 5,
	// NEW COMPARATOR<INTEGER>() {
	//
	// @OVERRIDE
	// PUBLIC INT COMPARE(INTEGER LHS, INTEGER RHS) {
	// RETURN LHS - RHS;
	// }
	//
	// });
	//
	// }

	// public void testSortTArray() {
	// Integer[] arrCopy = arr.clone();
	// Arrays.sort(arr);
	// sorter.sort(arrCopy);
	// for (int i = 0; i < arr.length; i++) {
	// assertEquals(arr[i], arrCopy[i]);
	// }
	// }

	// public void testSortTArrayComparatorOfT() {
	// Integer[] arrCopy = arr.clone();
	// Arrays.sort(arr, new Comparator<Integer>() {
	//
	// @Override
	// public int compare(Integer lhs, Integer rhs) {
	// return rhs - lhs;
	// }
	// });
	// sorter.sort(arrCopy, new Comparator<Integer>() {
	//
	// @Override
	// public int compare(Integer lhs, Integer rhs) {
	// return rhs - lhs;
	// }
	// });
	// for (int i = 0; i < arr.length; i++) {
	// L.d(arrCopy[i]);
	// assertEquals(arr[i], arrCopy[i]);
	// }
	// }
}
