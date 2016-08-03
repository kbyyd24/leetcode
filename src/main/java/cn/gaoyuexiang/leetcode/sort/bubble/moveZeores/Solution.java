package cn.gaoyuexiang.leetcode.sort.bubble.moveZeores;

/**
 *
 * issues : #18
 *
 */

public class Solution {
	public void moveZeroes(int[] nums) {
		int lastNonZero = -1;
		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] != 0 && lastNonZero == -1) lastNonZero = i;
			else if (nums[i] == 0 && lastNonZero != -1) {
				sort(nums, i, lastNonZero);
				lastNonZero--;
			}
		}
	}

	private void sort(int[] nums, int start, int end) {
		for (int i = start; i < end; i++) {
			int temp = nums[i];
			nums[i] = nums[i + 1];
			nums[i + 1] = temp;
		}
	}
}
