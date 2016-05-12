package com.practice.test.junit3;

import junit.framework.TestCase;

import org.junit.Test;

import com.practice.control.StackSolution;

public class TestStack extends TestCase {
	private StackSolution stack;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		stack = new StackSolution();
	}

	// private void testHelpMin() {
	// stack.push(3);
	// stack.push(4);
	// stack.push(2);
	// stack.push(5);
	// stack.push(1);
	// }
	//
	// private void testHelpIsPopOrder() {
	// stack.push(1);
	// stack.push(2);
	// stack.push(3);
	// stack.push(4);
	// stack.push(5);
	// }

	@Test
	public void testIsPopOrder() {
		int[] array = { 1, 2, 3, 4, 5 };
		int[] arrayCorr = { 4, 5, 3, 2, 1 };
		int[] arrayError = { 4, 3, 5, 1, 2 };
		assertEquals(true, stack.IsPopOrder(array, arrayCorr));
		assertEquals(false, stack.IsPopOrder(array, arrayError));
	}

	// @Test
	// public void testMin() {
	// assertEquals(stack.min(), 1);
	// stack.pop();// 1-pop
	// assertEquals(stack.min(), 2);
	// stack.pop(); // 5 pop
	// assertEquals(stack.min(), 2);
	// stack.pop(); // 2 pop
	// assertEquals(stack.min(), 3);
	// stack.pop(); // 4 pop
	// assertEquals(stack.min(), 3);
	// }

}
