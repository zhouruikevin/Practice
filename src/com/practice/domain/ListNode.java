package com.practice.domain;

import java.io.Serializable;

public class ListNode implements Serializable {

	private static final long serialVersionUID = 1L;
	public int val;
	public ListNode next = null;

	public ListNode(int val) {
		this.val = val;
	}
}
