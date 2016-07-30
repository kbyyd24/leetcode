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
		String val = Integer.toString(root.val);
		if (root.left == null && root.right == null) {
			ret.add(val);
			return ret;
		}
		List<String> sub = new ArrayList<>();
		if (root.left != null) sub.addAll(binaryTreePaths(root.left));
		if (root.right != null) sub.addAll(binaryTreePaths(root.right));
		sub.forEach(path -> {
			ret.add(val + "->" + path);
		});
		return ret;
	}
}