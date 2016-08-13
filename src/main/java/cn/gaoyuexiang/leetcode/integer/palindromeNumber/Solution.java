package cn.gaoyuexiang.leetcode.integer.palindromeNumber;

/**
 * issues : #28
 */

public class Solution {
	public boolean isPalindrome(int x) {
		if (x < 0) return false;
		if (x < 10) return true;
		int reverseX = 0;
		int cache = x;
		while (cache > 0) {
			reverseX = reverseX * 10 + cache % 10;
			cache /= 10;
		}
		return reverseX == x;
	}
}