package cn.gaoyuexiang.leetcode.rectangleArea;

/**
 issues : #2

 [https://leetcode.com/problems/rectangle-area/](https://leetcode.com/problems/rectangle-area/)

 Find the total area covered by two **rectilinear** rectangles in a **2D** plane.

 Each rectangle is defined by its bottom left corner and top right corner as shown in the figure.

 ![Alt text](https://leetcode.com/static/images/problemset/rectangle_area.png)

 Assume that the total area is never beyond the maximum possible value of **int**.
 */

public class Solution {
	public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
		int ret = (C - A) * (D - B) + (G - E) * (H - F);
		if (E < A && A < G) {
			int tmp = A;A = E;E = tmp;
			tmp = B;B = F;F = tmp;
			tmp = C;C = G;G = tmp;
			tmp = D;D = H;H = tmp;
		}
		if (C <= E || A >= G || B >= H || D <= F) return ret;
		if (A <= E && C <= G) {
			int width = C - E;
			if (B <= F) {
				if (D >= H) return ret - width * (H - F);
				return ret - width * (D - F);
			}
			if (D >= H) return ret - width * (H - B);
			return ret - width * (D - B);
		}
		int width = G - E;
		if (B <= F) {
			if (D >= H) return ret - width * (H - F);
			return ret - width * (D - F);
		}
		if (D >= H) return ret - width * (H - B);
		return ret - width * (D - B);
	}
}
