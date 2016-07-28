package cn.gaoyuexiang.leetcode.sort.insertion.sortList;

import cn.gaoyuexiang.leetcode.common.ListNode;
import org.junit.Test;

public class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void should_sort_the_list() throws Exception {
		ListNode retHead = new ListNode(1);
		retHead.next = new ListNode(2);
		retHead.next.next = new ListNode(3);
		retHead.next.next.next = new ListNode(4);

		ListNode unSort = new ListNode(3);
		unSort.next = new ListNode(2);
		unSort.next.next = new ListNode(4);
		unSort.next.next.next = new ListNode(1);

		ListNode sortHead = solution.insertionSortList(unSort);

		assert sortHead.val == retHead.val;
		assert sortHead.next.val == retHead.next.val;
		assert sortHead.next.next.val == retHead.next.next.val;
		assert sortHead.next.next.next.val == retHead.next.next.next.val;

	}
}