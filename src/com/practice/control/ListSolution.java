package com.practice.control;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import com.practice.domain.ListNode;

public class ListSolution {
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (listNode != null) {
			list.add(listNode.val);
			listNode = listNode.next;
		}
		int size = list.size();
		for (int i = 0; i < size - size / 2; i++) {
			swap(list, i, size - i - 1);
		}
		return list;
	}

	private void swap(ArrayList<Integer> list, int i, int j) {
		int temp = list.get(i);
		list.set(i, list.get(j));
		list.set(j, temp);
	}

	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		Map<ListNode, Integer> map = new HashMap<ListNode, Integer>();
		while (pHead1 != null) {
			map.put(pHead1, null);
			pHead1 = pHead1.next;
		}
		while (pHead2 != null) {
			if (map.containsKey(pHead2)) {
				return pHead2;
			}
			pHead2 = pHead2.next;
		}
		return null;
	}

	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();

	public void push(int node) {
		stack1.push(node);
	}

	public int pop() {
		while (!stack2.empty()) {
			return stack2.pop();
		}
		while (!stack1.empty()) {
			stack2.push(stack1.pop());
		}
		return stack2.pop();
	}

	public static ListNode ReverseList(ListNode head) {
		ListNode pre = null;
		ListNode next = null;
		while (head != null) {
			next = head.next;
			head.next = pre;
			pre = head;
			head = next;
		}
		return pre;
	}

	public ListNode MergeRes(ListNode list1, ListNode list2) {
		if (list1 == null)
			return list2;
		else if (list2 == null)
			return list1;
		ListNode mergeHead = null;
		if (list1.val < list2.val) {
			mergeHead = list1;
			mergeHead.next = Merge(list1.next, list2);
		} else {
			mergeHead = list2;
			mergeHead.next = Merge(list1, list2.next);
		}
		return mergeHead;

	}

	public static ListNode Merge(ListNode list1, ListNode list2) {
		// 新建一个头节点，用来存合并的链表。
		ListNode root = new ListNode(-1);
		ListNode head = root;

		while (list1 != null && list2 != null) {
			if (list1.val < list2.val) {
				head.next = list1;
				head = list1;
				list1 = list1.next;
			} else {
				head.next = list2;
				head = list2;
				list2 = list2.next;
			}
		}
		// 把未结束的链表连接到合并后的链表尾部
		if (list1 == null && list2 != null) {
			head.next = list2;
		}
		if (list1 != null && list2 == null) {
			head.next = list1;
		}
		return root.next;
	}

	public static ListNode FindKthToTail(ListNode head, int k) {
		if (head == null || k <= 0)
			return null;
		ListNode nodePre = head;
		ListNode nodeLast = head;

		for (int i = 1; i < k; i++) {
			if (nodePre.next != null)
				nodePre = nodePre.next;
			else
				return null;
		}

		while (nodePre.next != null) {
			nodePre = nodePre.next;
			nodeLast = nodeLast.next;
		}
		return nodeLast;
	}
}
