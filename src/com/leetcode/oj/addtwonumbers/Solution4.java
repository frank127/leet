package com.leetcode.oj.addtwonumbers;

/**
 * You are given two linked lists representing two non-negative numbers. The
 * digits are stored in reverse order and each of their nodes contain a single
 * digit. Add the two numbers and return it as a linked list.
 * 
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) Output: 7 -> 0 -> 8
 * 
 * @author frank
 * 
 */
public class Solution4 {
	
	/**
	 * Definition for singly-linked list.
	 */
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode result = null;
		int carryAdder = 0;
		ListNode currentL1 = l1;
		ListNode currentL2 = l2;

		do {

			int newVal = (currentL1 == null ? 0 : currentL1.val)
					+ (currentL2 == null ? 0 : currentL2.val) + carryAdder;
			if (newVal >= 10) {
				carryAdder = 1;
				newVal = newVal - 10;
			} else {
				carryAdder = 0;
			}

			if (result == null) {
				result = new ListNode(newVal);
			} else {
				ListNode current = result;
				while (current.next != null) {
					current = current.next;
				}
				current.next = new ListNode(newVal);

			}
			currentL1 = (currentL1 == null ? null : currentL1.next);
			currentL2 = (currentL2 == null ? null : currentL2.next);

		} while (currentL1 != null || currentL2 != null || carryAdder == 1);

		return result;
	}
	
	public static void main(String[] args)
	{
		ListNode n1 = new ListNode(1);
		n1.next = new ListNode(8);
		//n1.next.next = new ListNode(3);
		
		ListNode n2 = new ListNode(0);
		//n2.next = new ListNode(6);
		//n2.next.next = new ListNode(4);
		
		Solution4 s = new Solution4();
		ListNode n3 = s.addTwoNumbers(n1, n2);
		
		System.out.println(n3);		
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}	
}
