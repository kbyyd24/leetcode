package cn.gaoyuexiang.leetcode.array.twoSum;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  private Solution solution = new Solution();

  @Test
  public void should_return_an_array() throws Exception {
    int[] nums = {11, 2, 15, 7};
    int target = 9;
    int[] ret = {1, 3};
    int[] result = solution.twoSum(nums, target);
    assertArrayEquals(result, ret);
  }
}