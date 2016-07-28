package cn.gaoyuexiang.leetcode.plusOne;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void get_right_result() throws Exception {
		int[] digits = {1, 23, 234, 62};
		int[] result = solution.plusOne(digits);
		assertArrayEquals(result, new int[]{5, 7, 0, 3});
	}

	@Test
	public void name() throws Exception {
		int[] digits = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
		int[] result = solution.plusOne(digits);
		assertArrayEquals(result, new int[]{7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,7});
	}

	@Test
	public void should_up_number() throws Exception {
		int[] digits = {9};
		int[] result = solution.plusOne(digits);
		assertArrayEquals(result, new int[]{1,0});
	}
}