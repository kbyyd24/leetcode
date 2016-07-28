package cn.gaoyuexiang.leetcode.sort.merge.towArrays;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void should_merge_arrays() throws Exception {
		int[] ret = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] arr1 = {1, 3, 4, 7, 9, 0, 0, 0, 0, 0};
		int[] arr2 = {2, 5, 6, 8, 10};

		solution.merge(arr1, 5, arr2, 5);

		assertArrayEquals(arr1, ret);

	}
}