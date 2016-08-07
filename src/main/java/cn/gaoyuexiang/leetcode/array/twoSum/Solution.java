package cn.gaoyuexiang.leetcode.array.twoSum;

import java.util.HashMap;

/**
 *
 * issues : #20
 *
 */
public class Solution {
  public int[] twoSum(int[] nums, int target) {
    if (nums == null) return null;
    if (nums.length < 2) return nums;
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int diff = target - nums[i];
      if (map.containsKey(diff))
        return new int[]{map.get(diff), i};
      map.put(nums[i], i);
    }
    return null;
  }
}
