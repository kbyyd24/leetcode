package cn.gaoyuexiang.leetcode.sortlist;


/**
 * issues : #5
 *
 * Sort a linked list in O(n log n) time using constant space complexity.
 *
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
	public ListNode sortList(ListNode head) {
		if (head == null || head.next == null) return head;

		ListNode left = new ListNode(0), leftHead = left;
		ListNode right = new ListNode(0), rightHead = right;
		ListNode mid = new ListNode(0), midHead = mid;
		int val = head.val;

		while (head != null) {
			if (val < head.val) {
				right.next = head;
				right = head;
			} else if (val > head.val) {
				left.next = head;
				left = head;
			} else {
				mid.next = head;
				mid = head;
			}
			head = head.next;
		}

		left.next = null;
		right.next = null;
		mid.next = null;

		return merge(sortList(leftHead.next), midHead.next, sortList(rightHead.next));
	}

	private ListNode merge(ListNode head, ListNode mid, ListNode right) {
		ListNode headTail = getTail(head);
		ListNode midTail = getTail(mid);
		midTail.next = right;
		if (headTail != null) {
			headTail.next = mid;
			return head;
		}
		return mid;
	}

	private ListNode getTail(ListNode head) {
		if(head == null) return null;
		while(head.next != null) {
			head = head.next;
		}
		return head;
	}
}
