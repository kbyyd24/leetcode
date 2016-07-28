package cn.gaoyuexiang.leetcode.sort.merge.nLists;

import cn.gaoyuexiang.leetcode.common.ListNode;
import org.junit.Test;

public class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void should_merge_lists() throws Exception {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(4);

		l1.next = new ListNode(5);
		l1.next.next = new ListNode(7);
		l1.next.next.next = new ListNode(8);
		l1.next.next.next.next = new ListNode(12);

		l2.next = new ListNode(3);
		l2.next.next = new ListNode(9);
		l2.next.next.next = new ListNode(14);

		l3.next = new ListNode(6);
		l3.next.next = new ListNode(10);
		l3.next.next.next = new ListNode(11);
		l3.next.next.next.next = new ListNode(13);
		l3.next.next.next.next.next = new ListNode(15);

		ListNode ret = new ListNode(0), retHead = ret;
		for (int i = 1; i < 16; i++) {
			ret.next = new ListNode(i);
			ret = ret.next;
		}
		ret = retHead.next;

		ListNode[] lists = new ListNode[]{l1, l2, l3};

		ListNode result = solution.mergeKLists(lists);

		while (result != null) {
			assert result.val == ret.val;
			result = result.next;
			ret = ret.next;
		}

	}
}