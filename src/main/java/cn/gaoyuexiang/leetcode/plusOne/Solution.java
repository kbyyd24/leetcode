package cn.gaoyuexiang.leetcode.plusOne;

import java.util.ArrayList;

/**
 issues: #3

 Given a non-negative number represented as an array of digits, plus one to the number.

 The digits are stored such that the most significant digit is at the head of the list.

 */

public class Solution {
	public int[] plusOne(int[] digits) {
		if (digits == null) return null;
		int length = digits.length;
		digits[length - 1] ++;
		for (int i = length - 1; i > 0; i--) {
			digits[i - 1] += digits[i] / 10;
			digits[i] %= 10;
		}
		if (digits[0] > 9) {
			ArrayList<Integer> upNums = new ArrayList<>();
			while (digits[0] > 9) {
				upNums.add(digits[0] % 10);
				digits[0] /= 10;
			}
			int size = upNums.size();
			int[] ret = new int[length + size];
			ret[0] = digits[0];
			for (int i = 1; i < ret.length; i++) {
				if (i <= size) ret[i] = upNums.get(size - i);
				else ret[i] = digits[i - size];
			}
			return ret;
		}
		return digits;
	}
}
