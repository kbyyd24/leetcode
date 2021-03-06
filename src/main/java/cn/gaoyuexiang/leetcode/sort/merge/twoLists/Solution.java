package cn.gaoyuexiang.leetcode.sort.merge.twoLists;

import cn.gaoyuexiang.leetcode.common.ListNode;

/**
 *
 * issues : #6
 *
 * Merge two sorted linked lists and return it as a new list.
 * The new list should be made by splicing together the nodes of the first two lists.
 *
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Solution {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null) return l2;
		if (l2 == null) return l1;
		ListNode retHead = new ListNode(0), ret = retHead;
		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				ret.next = l1;
				l1 = l1.next;
			} else {
				ret.next = l2;
				l2 = l2.next;
			}
			ret = ret.next;
		}
		ret.next = l1 == null ? l2 : l1;
		return retHead.next;
	}
}
