package com.practice.test.junit3;

import java.util.ArrayList;

import junit.framework.TestCase;

import org.junit.Test;

import com.practice.control.ArraySolution;
import com.practice.control.TreeSolution;
import com.practice.domain.TreeNode;

public class test extends TestCase {

	int[] preArray = { 1, 2, 4, 7, 3, 5, 6, 8 };
	int[] inArray = { 4, 7, 2, 1, 5, 3, 8, 6 };

	int[] AfterArray = { 7, 4, 2, 5, 8, 6, 3, 1 };
	int[] levelArray = { 1, 2, 3, 4, 5, 6, 7, 8 };

//	@Test
//	public void testPrintFromTopToBottom() {
//		// 测试广度优先遍历函数 正确性
//		TreeNode node = TreeSolution.reConstructBinaryTree(preArray, inArray);
//		ArrayList<Integer> list = TreeSolution.PrintFromTopToBottom(node);
//		assertTrue(equal(levelArray, list));
//	}
//
//	@Test
//	public void testReConstructBinaryTree() {
//		TreeNode node = TreeSolution.reConstructBinaryTree(preArray, inArray);
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		// 测试重建二叉树正确性
//		// 同时测试先序遍历函数
//		TreeSolution.scanPreTree(node, list);
//		assertTrue(equal(preArray, list));
//		// 同时测试中序遍历函数
//		list.clear();
//		TreeSolution.scanInTree(node, list);
//		assertTrue(equal(inArray, list));
//		// 同时测试后序遍历函数
//		list.clear();
//		TreeSolution.scanBackTree(node, list);
//		assertTrue(equal(AfterArray, list));
//	}
//
//	private static boolean equal(int[] source, ArrayList<Integer> targ) {
//		if (source == null || targ == null || source.length != targ.size()) {
//			return false;
//		}
//		for (int i = 0; i < source.length; i++) {
//			if (source[i] != targ.get(i)) {
//				return false;
//			}
//		}
//		return true;
//	}

	// 5,[]
	int[][] array = { { 1, 2, 8, 9 }, { 2, 4, 9, 12 }, { 4, 7, 10, 13 },
			{ 6, 8, 11, 15 } };

	public void testFind() {
		assertEquals("", ArraySolution.Find(array, 5));
		assertEquals("0,0", ArraySolution.Find(array, 1));
		assertEquals("2,3", ArraySolution.Find(array, 13));

	}

}
