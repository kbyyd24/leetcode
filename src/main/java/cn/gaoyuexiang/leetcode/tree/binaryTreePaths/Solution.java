package cn.gaoyuexiang.leetcode.tree.binaryTreePaths;


import cn.gaoyuexiang.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 *

 Given a binary tree, return all root-to-leaf paths.

 For example, given the following binary tree:

 ```
 1
 /   \
 2     3
 \
 5
 ```

 All root-to-leaf paths are:

 ```
 ["1->2->5", "1->3"]
 ```

 *
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
	public List<String> binaryTreePaths(TreeNode root) {
		if (root == null) return new ArrayList<>();
		List<String> ret = new ArrayList<>();
		if (root.left == null && root.right == null) {
			ret.add(Integer.toString(root.val));
			return ret;
		}
		traverse(root, Integer.toString(root.val), ret);
		return ret;
	}

	private void traverse(TreeNode root, String path, List<String> ret) {
		if (root == null) return;
		if (root.left == null && root.right == null) {
			ret.add(path);
			return;
		}
		if (root.left != null)
			traverse(root.left, path + "->" + root.left.val, ret);
		if (root.right != null)
			traverse(root.right, path + "->" + root.right.val, ret);
	}
}