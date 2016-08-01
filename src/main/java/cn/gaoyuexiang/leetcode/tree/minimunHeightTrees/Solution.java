package cn.gaoyuexiang.leetcode.tree.minimunHeightTrees;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution {
	public List<Integer> findMinHeightTrees(int n, int[][] edges) {
		if (n < 1) return new ArrayList<>();
		if (n == 1) {
			ArrayList<Integer> ret = new ArrayList<>();
			ret.add(0);
			return ret;
		}

		List<HashSet<Integer>> labels = new ArrayList<>();
		for (int i = 0; i < n; i++) labels.add(new HashSet<>());
		for (int[] edge : edges) {
			labels.get(edge[0]).add(edge[1]);
			labels.get(edge[1]).add(edge[0]);
		}

		List<Integer> leaves = new ArrayList<>();
		for (int i = 0; i < labels.size(); i++) {
			if (labels.get(i).size() == 1) leaves.add(i);
		}

		while (n > 2) {
			n -= leaves.size();
			List<Integer> newLeaves = new ArrayList<>();
			leaves.forEach(leave -> {
				Integer next = labels.get(leave).iterator().next();
				labels.get(next).remove(leave);
				if (labels.get(next).size() == 1) newLeaves.add(next);
			});
			leaves = newLeaves;
		}

		return leaves;
	}
}
