package cn.gaoyuexiang.leetcode.array.dataStreamAsDisjointIntervals;

import cn.gaoyuexiang.leetcode.common.Interval;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SummaryRanges {
	private List<Integer> vals;

	public SummaryRanges() {
		vals = new ArrayList<>();
	}

	public void addNum(int val) {
		int n = vals.size();
		if (n == 0) {
			vals.add(val);
			return;
		}
		for (int i = 0; i < n; i++) {
			if (val == vals.get(i)) return;
			if (val < vals.get(i)) {
				vals.add(i, val);
				return;
			}
		}
		vals.add(val);
	}

	public List<Interval> getIntervals() {
		LinkedList<Interval> intervals = new LinkedList<>();
		vals.forEach(val -> {
			if (intervals.size() == 0) intervals.addLast(new Interval(val, val));
			else {
				int end = intervals.getLast().end;
				if (val == end);
				else if (val == end + 1) intervals.getLast().end++;
				else intervals.addLast(new Interval(val, val));
			}
		});
		return intervals;
	}

}
