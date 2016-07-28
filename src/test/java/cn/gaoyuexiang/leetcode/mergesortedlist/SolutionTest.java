package cn.gaoyuexiang.leetcode.mergesortedlist;

import cn.gaoyuexiang.leetcode.common.ListNode;
import org.junit.Test;

public class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void should_merge_lists() throws Exception {
		ListNode l1 = new ListNode(1), l1Head = l1;
		ListNode l2 = new ListNode(4), l2Head = l2;

		for (int i = 0; i < 5; i += 2) {
			l1.next = new ListNode(i + 3);
			l2.next = new ListNode(i + 6);
			l1 = l1.next;
			l2 = l2.next;
		}

		ListNode ret = new ListNode(1);
		ret.next = new ListNode(3);
		ret.next.next = new ListNode(4);
		ret.next.next.next = new ListNode(5);
		ret.next.next.next.next = new ListNode(6);
		ret.next.next.next.next.next = new ListNode(7);
		ret.next.next.next.next.next.next = new ListNode(8);
		ret.next.next.next.next.next.next.next = new ListNode(10);

		ListNode result = solution.mergeTwoLists(l1Head, l2Head);

		while (result != null) {
			assert result.val == ret.val;
			result = result.next;
			ret = ret.next;
		}

	}
}