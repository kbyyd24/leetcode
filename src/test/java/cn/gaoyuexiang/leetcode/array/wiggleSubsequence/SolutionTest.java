package cn.gaoyuexiang.leetcode.array.wiggleSubsequence;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void should_return_seven() throws Exception {
		int[] nums = {1, 17, 5, 10, 13, 15, 10, 5, 16, 8};
		int ret = 7;
		int res = solution.wiggleMaxLength(nums);
		assertEquals(res, ret);
	}

	@Test
	public void should_return_two() throws Exception {
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int ret = 2;
		int res = solution.wiggleMaxLength(nums);
		assertEquals(res, ret);
	}

	@Test
	public void work_with_special_input() throws Exception {
		int[] nums = {1, 2};
		int ret = 2;
		int res = solution.wiggleMaxLength(nums);
		assertEquals(res, ret);

		nums = new int[]{0, 0, 0, 0};
		ret = 1;
		res = solution.wiggleMaxLength(nums);
		assertEquals(res, ret);

		nums = new int[]{1};
		ret = 1;
		res = solution.wiggleMaxLength(nums);
		assertEquals(res, ret);

		ret = 0;
		res = solution.wiggleMaxLength(null);
		assertEquals(res, ret);
	}
}