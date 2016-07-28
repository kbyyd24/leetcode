package cn.gaoyuexiang.leetcode.sortlist;

import cn.gaoyuexiang.leetcode.common.ListNode;
import org.junit.Test;

public class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void should_sort_list() throws Exception {
		ListNode retHead = new ListNode(1), ret = retHead;
		for (int i = 2; i <= 10; i++) {
			ret.next = new ListNode(i);
			ret = ret.next;
		}

		ListNode unSortHead = new ListNode(10), unSort = unSortHead;
		for (int i = 9; i > 0; i--) {
			unSort.next = new ListNode(i);
			unSort = unSort.next;
		}

		ListNode sortHead = solution.sortList(unSortHead);

		while (sortHead != null) {
			assert sortHead.val == retHead.val;
			sortHead = sortHead.next;
			retHead = retHead.next;
		}

	}
}