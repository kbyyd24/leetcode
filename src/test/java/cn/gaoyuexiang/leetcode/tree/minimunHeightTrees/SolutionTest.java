package cn.gaoyuexiang.leetcode.tree.minimunHeightTrees;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void should_return_one_label() throws Exception {
		int n = 6;
		int[][] edges = {{0, 1}, {1, 2}, {1, 3}, {1, 4}, {4, 5}};
		List<Integer> ret = new ArrayList<>();
		ret.add(1);
		ret.add(4);

		List<Integer> res = solution.findMinHeightTrees(n, edges);

		assertEquals(res, ret);
	}
}