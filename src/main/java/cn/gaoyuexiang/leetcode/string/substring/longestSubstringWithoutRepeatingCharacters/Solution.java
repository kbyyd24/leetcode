package cn.gaoyuexiang.leetcode.string.substring.longestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;

/**
 * issues : #22
 */

public class Solution {
  public int lengthOfLongestSubstring(String s) {
    char[] chars = s.toCharArray();
    int ret = 0, cur = 0;
    HashMap<Character, Integer> charMap = new HashMap<>();
    for (int i = 0; i < chars.length; i++) {
      char item = chars[i];
      if (charMap.containsKey(item)) {
        ret = cur > ret ? cur : ret;
        i = charMap.get(item);
        charMap.clear();
        cur = 0;
      } else {
        charMap.put(item, i);
        cur ++;
      }
    }
    return ret >= cur ? ret : cur;
  }
}