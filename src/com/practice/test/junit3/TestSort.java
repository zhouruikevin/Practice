//package com.practice.test.junit3;
//
//import com.practice.control.sort.MergeSort;
//import com.practice.control.sort.QuickSort;
//
//import junit.framework.TestCase;
//
//public class TestSort extends TestCase {
//
//	int[] helper = { 7, 3, 2, 10, 5, 2, 6, 8 };
//	int[] helperQuick = helper.clone();
//	int[] correct = { 2, 2, 3, 5, 6, 7, 8, 10 };
//
//	public void testMergeIntArray() {
//		MergeSort.merge(helper);
//		for (int i = 0; i < helper.length; i++) {
//			assertEquals(helper[i], correct[i]);
//		}
//	}
//
//	public void testQuickSort() {
//		int index = QuickSort.quickSort(helper, 0, helper.length - 1);
//		assertEquals(index, 5);
//	}
//
//	public void testQuick() {
//		QuickSort.quick(helperQuick);
//		for (int i = 0; i < helperQuick.length; i++) {
//			assertEquals(helperQuick[i], correct[i]);
//		}
//	}
//
// }
