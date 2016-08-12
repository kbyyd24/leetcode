package cn.gaoyuexiang.leetcode.integer.reverseInteger;

public class Solution {
	public int reverse(int x) {
		boolean isPositive = x > 0;
		if (!isPositive) {
			x *= -1;
		}
		int ret = 0;
		while (x > 0) {
			if (ret > Integer.MAX_VALUE / 10) return 0;
			ret = ret * 10 + x % 10;
			x /= 10;
		}
		return isPositive ? ret : -1 * ret;
	}
}
