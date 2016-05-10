package com.practice.test.junit4;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import com.practice.control.TreeSolution;
import com.practice.domain.TreeNode;

public class TestTree {

	int[] preArray = { 1, 2, 4, 7, 3, 5, 6, 8 };
	int[] inArray = { 4, 7, 2, 1, 5, 3, 8, 6 };

	int[] AfterArray = { 4, 7, 2, 5, 8, 6, 3, 1 };
	int[] levelArray = { 1, 2, 3, 4, 7, 5, 6, 8 };

	@Test
	public void testPrintFromTopToBottom() {
		TreeNode node = TreeSolution.reConstructBinaryTree(preArray, inArray);
		ArrayList<Integer> list = TreeSolution.PrintFromTopToBottom(node);
		Assert.assertTrue(equal(levelArray, list));
	}

	@Test
	public void testReConstructBinaryTree() {
		TreeNode node = TreeSolution.reConstructBinaryTree(preArray, inArray);
	}

	private static boolean equal(int[] source, ArrayList<Integer> targ) {
		if (source == null || targ == null || source.length != targ.size()) {
			return false;
		}
		for (int i = 0; i < source.length; i++) {
			if (source[i] != targ.get(i)) {
				return false;
			}
		}
		return true;
	}

}
