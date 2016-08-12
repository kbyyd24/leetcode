package cn.gaoyuexiang.leetcode.integer.stringToInteger;

/**
 * issues : #27
 */

public class Solution {
	public int myAtoi(String str) {
		if (str == null) return 0;
		while (0 < str.length() && str.charAt(0) == ' ') str = str.substring(1);
		if (str.length() == 0) return 0;
		boolean isPositive = str.charAt(0) != '-';
		if (!isPositive) {
			str = str.substring(1);
		} else if (str.charAt(0) == '+') str = str.substring(1);
		int ret = 0;
		for (int i = 0; i < str.length(); i++) {
			int num = str.charAt(i) - '0';
			if (num < 0 || num > 9) break;
			if ((ret > Integer.MAX_VALUE / 10) || (ret == Integer.MAX_VALUE / 10 && num > 7))
				return isPositive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			ret = ret * 10 + Integer.parseInt(String.valueOf(num));
		}
		return isPositive ? ret : -ret;
	}
}