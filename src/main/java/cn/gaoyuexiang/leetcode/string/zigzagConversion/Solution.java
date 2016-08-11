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
		StringBuilder retBuilder = new StringBuilder();
		int roll = (numRows - 1) << 1;
		for (int i = 0; i < numRows; i++) {
			for (int j = i; j < s.length(); j += roll) {
				retBuilder.append(s.charAt(j));
				if (i != 0 && i != numRows - 1) {
					int inner = roll - (i << 1) + j;
					if (inner < s.length()) {
						retBuilder.append(s.charAt(inner));
					}
				}
			}
		}
		return retBuilder.toString();
	}
}