package cn.gaoyuexiang.leetcode.string.zigzagConversion;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void should_return_ZigZag_string() throws Exception {
		String s = "abcdefghijklmn";
		int numRows = 4;
		String expect = "agmbfhlnceikdj";
		String actual = solution.convert(s, numRows);
		assertEquals(expect, actual);
	}
}