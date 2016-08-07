package cn.gaoyuexiang.leetcode.array.twoSum;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  private Solution solution = new Solution();

  @Test
  public void should_return_an_array() throws Exception {
    int[] nums = {3, -3, 9, 2, 4};
    int target = 6;
    int[] ret = {1, 2};
    int[] result = solution.twoSum(nums, target);
    assertArrayEquals(result, ret);
  }
}