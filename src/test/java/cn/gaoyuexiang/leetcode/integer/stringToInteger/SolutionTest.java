package cn.gaoyuexiang.leetcode.integer.stringToInteger;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void should_return_a_number() throws Exception {
		String str = " +-2";
		int expect  = 0;
		int actual = solution.myAtoi(str);
		assertEquals(expect, actual);
	}
}