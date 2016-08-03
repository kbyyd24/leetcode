package cn.gaoyuexiang.leetcode.array.wiggleSubsequence;


/**
 *
 * issues : #14
 *
 */

public class Solution {
	public int wiggleMaxLength(int[] nums) {
		if (nums == null || nums.length == 0) return 0;
		if (nums.length == 1) return 1;
		int n = nums.length - 1;
		int counter = 1;
		int pre = 0;
		for (int i = 0; i < n; i++) {
			int sub = nums[i + 1] - nums[i];
			if (sub == 0) continue;
			sub = sub > 0? 1 : -1;
			if (pre == 0) {
				pre = sub;
				counter++;
				continue;
			}
			if (sub + pre == 0) {
				pre = sub;
				counter++;
			}
		}

		return counter;
	}
}
