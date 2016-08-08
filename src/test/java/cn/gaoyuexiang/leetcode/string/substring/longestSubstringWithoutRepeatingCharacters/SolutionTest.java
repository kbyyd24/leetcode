package cn.gaoyuexiang.leetcode.string.substring.longestSubstringWithoutRepeatingCharacters;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
  
  private Solution solution = new Solution();

  @Test
  public void should_return_right_number() throws Exception {
    String s = "dvdf";
    int ret = 3;
    int length = solution.lengthOfLongestSubstring(s);
    assertEquals(ret, length);
  }
}