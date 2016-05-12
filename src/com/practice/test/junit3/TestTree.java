package com.practice.test.junit3;

import java.util.ArrayList;

import junit.framework.TestCase;

import com.practice.control.TreeSolution;
import com.practice.domain.TreeNode;

public class TestTree extends TestCase {

	TreeNode node1, node2;
	TreeSolution solution;
	ArrayList<ArrayList<Integer>> array, arrayCorr;

	@Override
	protected void setUp() throws Exception {
		solution = new TreeSolution();
		// {10,5,12,4,7},22
		node1 = new TreeNode(10);
		TreeNode s1 = new TreeNode(5);
		TreeNode s2 = new TreeNode(12);
		node1.left = s1;
		node1.right = s2;
		TreeNode ss1 = new TreeNode(4);
		TreeNode ss2 = new TreeNode(7);
		s1.left = ss1;
		s1.right = ss2;

		array = solution.FindPath(node1, 22);
		arrayCorr = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> arraySub1 = new ArrayList<Integer>();
		arraySub1.add(10);
		arraySub1.add(12);
		ArrayList<Integer> arraySub2 = new ArrayList<Integer>();
		arraySub2.add(10);
		arraySub2.add(5);
		arraySub2.add(7);
		arrayCorr.add(arraySub2);
		arrayCorr.add(arraySub1);

		super.setUp();
	}

	// public void testHasSubtree() {
	// assertEquals(true, TreeSolution.HasSubtree(node1, node2));
	// assertEquals(false, TreeSolution.HasSubtree(node1, null));
	// node2.right = node1;
	// assertEquals(false, TreeSolution.HasSubtree(node1, node2));
	// }

	public void testFindPath() {
		assertEquals(arrayCorr, array);
	}

}
