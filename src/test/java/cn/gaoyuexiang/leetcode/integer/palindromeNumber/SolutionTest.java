package cn.gaoyuexiang.leetcode.integer.palindromeNumber;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void should_return_true() throws Exception {
		int x = 1234321;
		boolean isPalindrome = solution.isPalindrome(x);
		assertTrue(isPalindrome);
	}

	@Test
	public void should_return_false() throws Exception {
		int x = -1233252;
		boolean isPalindrome = solution.isPalindrome(x);
		assertFalse(isPalindrome);
	}
}