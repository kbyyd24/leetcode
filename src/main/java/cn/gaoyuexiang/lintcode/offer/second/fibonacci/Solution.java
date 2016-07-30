package cn.gaoyuexiang.lintcode.offer.second.fibonacci;

public class Solution {
	public int fibonacci(int n) {
		// write your code here
		if (n < 1) return -1;
		int a = 0, b = 1;
		for (int i = 1; i < n; i++) {
			int c = a + b;
			a = b;
			b = c;
		}
		return a;
	}
}
