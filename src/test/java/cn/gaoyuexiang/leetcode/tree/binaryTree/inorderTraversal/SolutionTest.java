package cn.gaoyuexiang.leetcode.tree.binaryTree.inorderTraversal;

import cn.gaoyuexiang.leetcode.common.TreeNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void should_return_empty_list() throws Exception {
		List<Integer> ret = new ArrayList<>();
		List<Integer> result = solution.inorderTraversal(null);
		assertEquals(result, ret);

	}

	@Test
	public void should_return_answer() throws Exception {
		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(2);
		root.right.left = new TreeNode(3);
		List<Integer> ret = new ArrayList<>();
		ret.add(1);
		ret.add(3);
		ret.add(2);
		List<Integer> result = solution.inorderTraversal(root);
		assertEquals(result, ret);
	}

	@Test
	public void should_return_right_answer() throws Exception {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		root.left.left.left = new TreeNode(8);
		root.left.left.left.left = new TreeNode(10);
		root.left.left.left.right = new TreeNode(11);
		root.left.right.right = new TreeNode(9);
		root.left.right.right.left = new TreeNode(12);
		root.left.right.right.right = new TreeNode(13);
		List<Integer> ret = new ArrayList<>(13);
		ret.add(10);
		ret.add(8);
		ret.add(11);
		ret.add(4);
		ret.add(2);
		ret.add(5);
		ret.add(12);
		ret.add(9);
		ret.add(13);
		ret.add(1);
		ret.add(6);
		ret.add(3);
		ret.add(7);

		List<Integer> result = solution.inorderTraversal(root);

		assertEquals(result, ret);
	}
}