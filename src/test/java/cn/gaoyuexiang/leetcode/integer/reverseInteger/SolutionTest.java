package cn.gaoyuexiang.leetcode.integer.reverseInteger;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void should_return_0() throws Exception {
		int x = -2147483648;
		int expect = 0;
		int actual = solution.reverse(x);
		assertEquals(actual, expect);
	}
}