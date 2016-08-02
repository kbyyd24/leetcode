package cn.gaoyuexiang.leetcode.tree.binaryTree.inorderTraversal;

import cn.gaoyuexiang.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * issues : #16
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
	public List<Integer> inorderTraversal(TreeNode root) {
		if (root == null) return new ArrayList<>();
		LinkedList<TreeNode> cache = new LinkedList<>();
		ArrayList<Integer> ret = new ArrayList<>();
		TreeNode p = root;
		boolean isReaded = false;
		while (p != null) {
			if (p.left == null && p.right == null) {
				ret.add(p.val);
				if (!cache.isEmpty()) {
					p = cache.pop();
					isReaded = true;
				}
				else
					break;
			} else if (p.left == null) {
				ret.add(p.val);
				p = p.right;
			} else if (p.right == null) {
				if (isReaded) {
					ret.add(p.val);
					p = cache.isEmpty() ? null : cache.pop();
				} else {
					cache.push(p);
					p = p.left;
				}
			} else {
				if (isReaded) {
					ret.add(p.val);
					p = p.right;
					isReaded = false;
				} else {
					cache.push(p);
					p = p.left;
				}
			}
		}
		return ret;
	}
}
