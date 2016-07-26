package cn.gaoyuexiang.leetcode.rectanglearea;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void no_covered_repeat() throws Exception {
		int A = 0, B = 0, C = 1, D = 1,
						E = 1, F = 0, G = 3, H = 1;
		int res = solution.computeArea(A, B, C, D, E, F, G, H);
		assertEquals(res, 3);
	}

	@Test
	public void repeat_coverage() throws Exception {
		int A = -1, B = 0, C = 4, D = 2,
						E = 0, F = -2, G = 3, H = 3;
		int res = solution.computeArea(A, B, C, D, E, F, G, H);
		assertEquals(res, 19);
	}
}