package cn.gaoyuexiang.leetcode.sort.bubble.moveZeores;

/**
 *
 * issues : #18
 *
 */

public class Solution {
	public void moveZeroes(int[] nums) {
		for (int firstZero = 0, i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				int temp = nums[firstZero];
				nums[firstZero++] = nums[i];
				nums[i] = temp;
			}
		}
	}
}
