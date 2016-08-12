package cn.gaoyuexiang.leetcode.integer.reverseInteger;

public class Solution {
	public int reverse(int x) {
		if (x == Integer.MIN_VALUE) return 0;
		if (Math.abs(x) < 10) return x;
		String raw = String.valueOf(x);
		int ret = Integer.parseInt(raw.substring(raw.length() - 1));
		int flag = 1;
		if (x < 0) {
			raw = raw.substring(1);
			flag = -1;
		}
		int bigRet = Integer.MAX_VALUE / 10;
		int reminder = Integer.MAX_VALUE % 10;
		for (int i = raw.length() - 2; i >= 0; i--) {
			int k = Integer.parseInt(raw.substring(i, i + 1));
			if (bigRet < ret) return 0;
			if (bigRet == ret && k > reminder) return 0;
			ret = ret * 10 + k;
		}
		ret *= flag;
		return ret;
	}
}
