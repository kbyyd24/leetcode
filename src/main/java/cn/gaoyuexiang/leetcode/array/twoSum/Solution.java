package cn.gaoyuexiang.leetcode.array.twoSum;

/**
 *
 * issues : #20
 *
 */
public class Solution {
  public int[] twoSum(int[] nums, int target) {
    if (nums == null) return null;
    if (nums.length < 2) return nums;
    int length = nums.length;
    for (int i = 0; i < length - 1; i++) {
      int diff = target - nums[i];
      for (int j = i + 1; j < length; j++) {
        if (diff == nums[j])
          return new int[]{i, j};
      }
    }
    return new int[0];
  }
}
