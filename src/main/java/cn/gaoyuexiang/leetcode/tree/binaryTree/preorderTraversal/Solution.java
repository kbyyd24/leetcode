package cn.gaoyuexiang.leetcode.tree.binaryTree.preorderTraversal;

import cn.gaoyuexiang.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * issues : #15
 *
 Given a binary tree, return the preorder traversal of its nodes' values.

 For example:
 Given binary tree `{1,#,2,3}`,

 ```
 1
 \
 2
 /
 3
 ```

 return `[1,2,3]`.

 **Note**: Recursive solution is trivial, could you do it iteratively?

 *
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
	public List<Integer> preorderTraversal(TreeNode root) {
		if (root == null) return new ArrayList<>();
		if (root.left == null && root.right == null) {
			ArrayList<Integer> ret = new ArrayList<>();
			ret.add(root.val);
			return ret;
		}
		LinkedList<TreeNode> cache = new LinkedList<>();
		ArrayList<Integer> ret = new ArrayList<>();
		TreeNode p = root;
		while (p != null) {
			ret.add(p.val);
			if (p.left == null && p.right == null) {
				if (!cache.isEmpty())
					p = cache.pop();
				else
					p = null;
			} else if (p.right == null) {
				p = p.left;
			} else 	if (p.left == null) {
				p = p.right;
			} else {
				cache.push(p.right);
				p = p.left;
			}
		}

		return ret;
	}
}
