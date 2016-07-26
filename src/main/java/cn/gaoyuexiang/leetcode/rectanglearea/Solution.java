package cn.gaoyuexiang.leetcode.rectanglearea;

/**
 [https://leetcode.com/problems/rectangle-area/](https://leetcode.com/problems/rectangle-area/)

 Find the total area covered by two **rectilinear** rectangles in a **2D** plane.

 Each rectangle is defined by its bottom left corner and top right corner as shown in the figure.

 ![Alt text](https://leetcode.com/static/images/problemset/rectangle_area.png)

 Assume that the total area is never beyond the maximum possible value of **int**.
 */

public class Solution {
	public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
		int areaA = (C - A) * (D - B);
		int areaB = (G - E) * (H - F);
		return areaA + areaB;
	}
}
