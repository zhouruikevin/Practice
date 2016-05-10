package com.practice.test.junit3;

import junit.framework.TestCase;

import com.practice.control.ListSolution;
import com.practice.domain.ListNode;

public class TestList extends TestCase {
	private ListNode l1;
	private ListNode l0;

	@Override
	protected void setUp() throws Exception {
		l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		l1.next = l2;
		l2.next = l3;

		l0 = new ListNode(0);
		ListNode l4 = new ListNode(4);
		l0.next = l4;
		super.setUp();
	}

	// public void testReverseList() {
	//
	// ListNode node = ListSolution.ReverseList(l1);
	// assertEquals(node.val, 3);
	// assertEquals(node.next.val, 2);
	// assertEquals(node.next.next.val, 1);
	// assertEquals(node.next.next.next, null);
	// }
	//
	// public void testMerge() {
	// ListNode node = ListSolution.Merge(l1, l0);
	//
	// for (int i = 0; i < 6; i++) {
	// if (i != 5) {
	// assertEquals(node.val, i);
	// node = node.next;
	// } else {
	// assertEquals(node, null);
	// }
	// }
	// }
	public void testFindKthToTail() {
		assertEquals(3, ListSolution.FindKthToTail(l1, 1).val);
		assertEquals(2, ListSolution.FindKthToTail(l1, 2).val);
		assertEquals(4, ListSolution.FindKthToTail(l0, 1).val);
	}
}
