package cn.gaoyuexiang.leetcode.string.zigzagConversion;

import java.util.ArrayList;
import java.util.List;

/**
 * issues : #25
 */

public class Solution {
	public String convert(String s, int numRows) {
		if (s == null) return null;
		if (s.length() <= numRows || numRows == 1) return s;
		ArrayList[] retArray = new ArrayList[numRows];
		boolean isUp = true;
		for (int i = 0, r = 0; i < s.length(); i++) {
			if (retArray[r] == null) retArray[r] = new ArrayList<Character>();
			retArray[r].add(s.charAt(i));
			if (isUp) {
				r++;
				if (r == numRows) {
					r -= 2;
					isUp = false;
				}
			} else {
				if (r == 0) {
					r++;
					isUp = true;
				} else {
					r--;
				}
			}
		}
		StringBuilder retBuilder = new StringBuilder();
		for (int i = 0; i < numRows; i++) {
			List<Character> list = retArray[i];
			int len = list.size();
			for (int j = 0; j < len; j++) {
				retBuilder.append(list.get(j));
			}
		}
		return retBuilder.toString();
	}
}
