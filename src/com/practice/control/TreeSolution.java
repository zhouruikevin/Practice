package com.practice.control;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import com.practice.domain.TreeNode;

public class TreeSolution {

	/**
	 * 深度优先 先序遍历
	 */
	public static void scanPreTree(TreeNode root, ArrayList<Integer> list) {
		if (root == null) {
			return;
		}
		list.add(root.val);
		scanPreTree(root.left, list);
		scanPreTree(root.right, list);
	}

	/** 中序 */
	public static void scanInTree(TreeNode root, ArrayList<Integer> list) {
		if (root == null) {
			return;
		}
		scanInTree(root.left, list);
		list.add(root.val);
		scanInTree(root.right, list);
	}

	/** 后序 */
	public static void scanBackTree(TreeNode root, ArrayList<Integer> list) {
		if (root == null) {
			return;
		}
		scanBackTree(root.left, list);
		scanBackTree(root.right, list);
		list.add(root.val);
	}

	/** 广度优先遍历 从上往下打印出二叉树的每个节点，同层节点从左至右打印。 */
	public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		if (root != null) {
			queue.offer(root);
		}
		while (queue != null && queue.size() != 0) {
			TreeNode node = queue.poll();
			list.add(node.val);
			if (node.left != null) {
				queue.offer(node.left);
			}
			if (node.right != null) {
				queue.offer(node.right);
			}
		}
		return list;
	}

	/**
	 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。例如输入前序遍历序列{1,2,4,
	 * 7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
	 */
	public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		TreeNode rootNode = reConstructBinaryTree(pre, 0, pre.length - 1, in,
				0, in.length - 1);
		return rootNode;
	}

	private static TreeNode reConstructBinaryTree(int[] pre, int pStart,
			int pEnd, int[] in, int inStart, int inEnd) {
		if (pStart > pEnd || inStart > inEnd) {
			return null;
		}
		TreeNode node = new TreeNode(pre[pStart]);
		for (int i = inStart; i <= inEnd; i++) {
			if (pre[pStart] == in[i]) {
				node.left = reConstructBinaryTree(pre, pStart + 1, pStart + i
						- inStart, in, inStart, i - 1);
				node.right = reConstructBinaryTree(pre, pStart + i - inStart
						+ 1, pEnd, in, i + 1, inEnd);
			}
		}
		return node;
	}
}
