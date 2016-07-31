package cn.gaoyuexiang.leetcode.tree.minimunHeightTrees;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void should_return_one_tree_label() throws Exception {
		int[][] edges = {{0, 1}, {1, 2}};
		int n = 3;
		List<Integer> ret = new ArrayList<>();
		ret.add(1);

		List<Integer> res = solution.findMinHeightTrees(n, edges);

		assertEquals(ret, res);
	}
}