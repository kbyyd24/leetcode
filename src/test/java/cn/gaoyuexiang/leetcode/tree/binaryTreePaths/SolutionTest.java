package cn.gaoyuexiang.leetcode.tree.binaryTreePaths;

import cn.gaoyuexiang.leetcode.common.TreeNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void should_get_list() throws Exception {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.right = new TreeNode(5);

		ArrayList<String> ret = new ArrayList<>();
		ret.add("1->2->5");
		ret.add("1->3");

		List<String> res = solution.binaryTreePaths(root);

		assertEquals(ret, res);
	}
}