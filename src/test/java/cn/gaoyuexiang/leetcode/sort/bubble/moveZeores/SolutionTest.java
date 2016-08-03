package cn.gaoyuexiang.leetcode.sort.bubble.moveZeores;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
	
	private Solution solution = new Solution();

	@Test
	public void should_move_zeroes() throws Exception {
		int[] nums = {0, 1, 0, 3, 12};
		int[] ret = {1, 3, 12, 0, 0};
		solution.moveZeroes(nums);
		assertArrayEquals(nums, ret);
	}
}