package com.practice.test.junit3;

import com.practice.control.TreeSolution;
import com.practice.domain.TreeNode;

import junit.framework.TestCase;

public class TestTree extends TestCase {

	TreeNode node1, node2;

	@Override
	protected void setUp() throws Exception {
		node1 = new TreeNode(1);
		TreeNode s1 = new TreeNode(2);
		TreeNode s2 = new TreeNode(3);
		node1.left = s1;
		node1.right = s2;
		TreeNode ss1 = new TreeNode(3);
		s1.left = ss1;

		node2 = new TreeNode(2);
		node2.left = ss1;
		super.setUp();
	}

	public void testHasSubtree() {
		assertEquals(true, TreeSolution.HasSubtree(node1, node2));
		assertEquals(false, TreeSolution.HasSubtree(node1, null));
		node2.right = node1;
		assertEquals(false, TreeSolution.HasSubtree(node1, node2));
	}

}
