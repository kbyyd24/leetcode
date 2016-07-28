package cn.gaoyuexiang.leetcode.sort.merge.nLists;

import cn.gaoyuexiang.leetcode.common.ListNode;

/**
 *
 * issues : #8
 *
 * Merge k sorted linked lists and return it as one sorted list.
 * Analyze and describe its complexity.
 *
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Solution {
	public ListNode mergeKLists(ListNode[] lists) {
		if (lists.length == 0) return null;
		if (lists.length == 1) return lists[0];
		if (lists.length == 2) return mergeTwoLists(lists[0], lists[1]);
		ListNode[] retLists = new ListNode[(lists.length + 1) / 2];
		while (retLists.length > 1) {
			for (int i = 0; i < retLists.length; i++) {
				int k = i * 2;
				if (k + 1 == lists.length) {
					retLists[i] = lists[k];
				} else {
					retLists[i] = mergeTwoLists(lists[k], lists[k + 1]);
				}
			}
			lists = retLists;
			retLists = new ListNode[(lists.length + 1) / 2];
		}
		return mergeTwoLists(lists[0], lists[1]);
	}

	private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
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
