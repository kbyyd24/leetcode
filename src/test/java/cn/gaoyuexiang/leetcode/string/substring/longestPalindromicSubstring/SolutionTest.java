package cn.gaoyuexiang.leetcode.string.substring.longestPalindromicSubstring;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void should_return_a_string() throws Exception {
		String s = "mkuixwymlzmvrtxpqtomvvpsdnwgslqhyqopwzlgkktjxpayeratkvetdzbevkfkckmmjvftrrbmykvvklzjve";
		String expect = "kvvk";
		String actual = solution.longestPalindrome(s);
		assertEquals(expect, actual);
	}
}