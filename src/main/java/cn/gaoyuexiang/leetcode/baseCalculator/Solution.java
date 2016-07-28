package cn.gaoyuexiang.leetcode.baseCalculator;

import java.util.Stack;

/**
 Implement a basic calculator to evaluate a simple expression string.

 The expression string may contain open `(` and closing parentheses `)`,
 the plus `+` or minus sign `-`, **non-negative** integers and empty spaces ` `.

 You may assume that the given expression is always valid.

 Some examples:

 ```
 "1 + 1" = 2
 " 2-1 + 2 " = 3
 "(1+(4+5+2)-3)+(6+8)" = 23
 ```

 **Note: Do not** use the `eval` built-in library function.
 */

public class Solution {
	public int calculate(String s) {
		char[] chars = s.toCharArray();
		return getResult(chars);
	}

	private int getResult(char[] chars) {
		int result = 0;
		int number = -1;
		Stack<Character> signs = new Stack<>();
		Stack<Integer> results = new Stack<>();
		for (char aChar : chars) {
			if (aChar == ' ') {
				if (number != -1) {
					result = calc(result, number, signs);
					number = -1;
				}
				continue;
			}
			if (aChar == '+' || aChar == '-') {
				if (number != -1) {
					result = calc(result, number, signs);
					number = -1;
				}
				signs.push(aChar);
				continue;
			}
			if (aChar == '(') {
				signs.push(aChar);
				results.push(result);
				result = 0;
				continue;
			}
			if (aChar == ')') {
				if (number != -1) {
					result = calc(result, number, signs);
					number = -1;
				}
				signs.pop();
				result = calc(results.pop(), result, signs);
				continue;
			}
			if (number == -1) number = 0;
			number = number * 10 + Character.getNumericValue(aChar);
		}
		if (number != -1) {
			result = calc(result, number, signs);
		}
		return result;
	}

	private int calc(int result, int optNumber, Stack<Character> signs) {
		if (signs.empty() || signs.peek() == '(')
			result += optNumber;
		else{
			Character pop = signs.pop();
			if (pop == '+') result += optNumber;
			else result -= optNumber;
		}
		return result;
	}
}
