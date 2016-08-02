package cn.gaoyuexiang.leetcode.tree.binaryTree.postorderTraversal;

import cn.gaoyuexiang.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * issues : #17
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

	private class Node {
		TreeNode val;
		boolean left;
		boolean right;
	}

	public List<Integer> postorderTraversal(TreeNode root) {
		if (root == null) return new ArrayList<>();
		LinkedList<Node> cache = new LinkedList<>();
		List<Integer> ret = new ArrayList<>();
		Node p = new Node();
		p.val = root;
		while (p != null) {
			if (p.val.left == null && p.val.right == null) {
				p = addToRet(cache, ret, p);
			} else if (p.val.left == null) {
				if (p.right) {
					p = addToRet(cache, ret, p);
				} else {
					p = gotoRight(cache, p);
				}
			} else if (p.val.right == null) {
				if (p.left) {
					p = addToRet(cache, ret, p);
				} else {
					p = gotoLeft(cache, p);
				}
			} else {
				if (!p.left) {
					p = gotoLeft(cache, p);
				} else if (!p.right) {
					p = gotoRight(cache, p);
				} else {
					p = addToRet(cache, ret, p);
				}
			}
		}
		return ret;
	}

	private Node addToRet(LinkedList<Node> cache, List<Integer> ret, Node p) {
		ret.add(p.val.val);
		p = cache.isEmpty() ? null : cache.pop();
		return p;
	}

	private Node gotoLeft(LinkedList<Node> cache, Node p) {
		p.left = true;
		cache.push(p);
		Node tmp = new Node();
		tmp.val = p.val.left;
		p = tmp;
		return p;
	}

	private Node gotoRight(LinkedList<Node> cache, Node p) {
		p.right = true;
		cache.push(p);
		Node tmp = new Node();
		tmp.val = p.val.right;
		p = tmp;
		return p;
	}
}
