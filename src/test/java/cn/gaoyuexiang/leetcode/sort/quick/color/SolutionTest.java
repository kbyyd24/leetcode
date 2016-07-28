package cn.gaoyuexiang.leetcode.sort.quick.color;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void should_sort_array() throws Exception {
		int[] src = {0, 2, 1, 1, 1, 2, 2, 1, 0, 0, 1, 2, 2};
		int[] res = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2};
		solution.sortColors(src);
		Assert.assertArrayEquals(src, res);
	}
}