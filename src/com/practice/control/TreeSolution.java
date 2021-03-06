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

	private ArrayList<ArrayList<Integer>> listAll = new ArrayList<ArrayList<Integer>>();
	private ArrayList<Integer> list = new ArrayList<Integer>();

	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
		if (root == null) {
			return listAll;
		}
		list.add(root.val);
		target -= root.val;
		if (target == 0 && root.left == null && root.right == null) {
			listAll.add(new ArrayList<Integer>(list));
		}
		FindPath(root.left, target);
		FindPath(root.right, target);
		// 深度遍历，每遍历完一条路径需要回退一步，不然会把上一个路径的值加入当前路径
		list.remove(list.size() - 1);
		return listAll;
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

	public static boolean HasSubtree(TreeNode root1, TreeNode root2) {
		// 注意为空 不是子树
		if (root2 == null) {
			return false;
		}
		if (root1 == null && root2 != null) {
			return false;
		}
		boolean flag = isSubtree(root1, root2);
		if (!flag) {
			flag = HasSubtree(root1.left, root2);
			if (!flag) {
				flag = HasSubtree(root1.right, root2);
			}
		}
		return flag;
	}

	public static boolean isSubtree(TreeNode root1, TreeNode root2) {
		// 这里是判断路径上所有值都判断完了，不是判断子树
		if (root2 == null) {
			return true;
		}
		if (root1 == null && root2 != null) {
			return false;
		}
		if (root1.val == root2.val) {
			return isSubtree(root1.left, root2.left)
					&& isSubtree(root1.right, root2.right);
		}
		return false;
	}

	public static void Mirror(TreeNode root) {
		if (root == null) {
			return;
		}
		Mirror(root.left);
		Mirror(root.right);
		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;
	}
}
