package cn.gaoyuexiang.leetcode.string.substring.longestPalindromicSubstring;

/**
 * issues : #24
 */

public class Solution {
	public String longestPalindrome(String s) {
		if (s == null || s.length() == 1) return s;
		int len = s.length();
		int max = 0;
		int startIdx = 0;
		for (int i = 0; i < len - 1; i++) {
			int oddLen = getSubLength(s, i, i);
			int evenLen = getSubLength(s, i, i + 1);
			int maxCache = oddLen > evenLen ? oddLen : evenLen;
			if (maxCache > max) {
				max = maxCache;
				startIdx = max % 2 == 1 ? i - (max >> 1) : i - (max >> 1) + 1;
			}
		}
		return s.substring(startIdx, startIdx + max);
	}

	private int getSubLength(String s, int L, int R) {
		while (R < s.length() && L >= 0) {
			if (s.charAt(L) != s.charAt(R)) break;
			R++;
			L--;
		}
		R--;
		L++;
		return R - L + 1;
	}

}