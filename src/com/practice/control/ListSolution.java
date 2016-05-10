package com.practice.control;

import java.util.ArrayList;
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
}
