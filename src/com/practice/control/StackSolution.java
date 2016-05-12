package com.practice.control;

import java.util.Stack;

public class StackSolution {
	private Stack<Integer> stack = new Stack<Integer>();
	private Stack<Integer> minStack = new Stack<Integer>();
	private Integer min = null;

	public boolean IsPopOrder(int[] pushA, int[] popA) {
		if (pushA == null || popA == null || popA.length != pushA.length
				|| pushA.length == 0) {
			return false;
		}
		Stack<Integer> stack = new Stack<Integer>();
		int index = 0;
		for (int i = 0; i < pushA.length; i++) {
			stack.push(pushA[i]);
			while (!stack.isEmpty() && popA[index] == stack.peek()) {
				stack.pop();
				index++;
			}
		}
		return stack.isEmpty();
	}

	public void push(int node) {
		if (min == null) {
			min = node;
			minStack.push(min);
		} else {
			if (min > node) {
				min = node;
				minStack.push(min);
			}
		}
		stack.push(node);
	}

	public void pop() {
		int temp = minStack.pop();
		if (temp != stack.pop()) {
			minStack.push(temp);
		}
	}

	public int top() {
		int temp = stack.pop();
		stack.push(temp);
		return temp;
	}

	public int min() {
		int temp = minStack.pop();
		minStack.push(temp);
		return temp;
	}

}
