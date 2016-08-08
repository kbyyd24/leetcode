package cn.gaoyuexiang.leetcode.string.substring.longestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;
import java.util.Map;

/**
 * issues : #22
 */

public class Solution {
  public int lengthOfLongestSubstring(String s) {
    int len = s.length(), ret = 0;
    HashMap<Character, Integer> charMap = new HashMap<>();
    for (int i = 0, j = 0; i < len; i++) {
      char item = s.charAt(i);
      if (charMap.containsKey(item)) {
        j = Math.max(charMap.get(item), j);
      }
      ret = Math.max(ret, i - j + 1);
      charMap.put(item, i + 1);
    }
    return ret;
  }
}