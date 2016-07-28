package cn.gaoyuexiang.leetcode.insertionsortlist;

import cn.gaoyuexiang.leetcode.common.ListNode;

/**
 * issues : #4
 *
 * Sort a linked list using insertion sort.
 *
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Solution {
	public ListNode insertionSortList(ListNode head) {
		if (head == null) return null;
		if (head.next == null) return head;
		ListNode p, s;
		ListNode ret = new ListNode(head.val);
		head = head.next;
		while (head != null) {
			if (head.val < ret.val) {
				p = head;
				head = head.next;
				p.next = ret;
				ret = p;
			} else {
				p = ret.next;
				s = ret;
				while (p != null && p.val <= head.val) {
					p = p.next;
					s = s.next;
				}
				s.next = head;
				head = head.next;
				s.next.next = p;
			}
		}
		return ret;
	}
}
