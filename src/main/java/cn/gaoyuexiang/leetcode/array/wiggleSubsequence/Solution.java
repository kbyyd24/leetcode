package cn.gaoyuexiang.leetcode.array.wiggleSubsequence;

import java.util.LinkedList;

public class Solution {
	public int wiggleMaxLength(int[] nums) {
		if (nums == null || nums.length == 0) return 0;
		if (nums.length == 1) return 1;
		int n = nums.length - 1;
		LinkedList<Integer> subList = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			int sub = nums[i + 1] - nums[i];
			if (sub == 0) continue;
			sub = sub > 0? 1 : -1;
			if (subList.size() == 0) {
				subList.add(sub);
				continue;
			}
			if (subList.getLast() + sub == 0)
				subList.add(sub);
		}

		return subList.size() + 1;
	}
}
