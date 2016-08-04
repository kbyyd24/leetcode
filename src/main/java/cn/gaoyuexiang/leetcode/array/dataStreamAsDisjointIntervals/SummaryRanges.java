package cn.gaoyuexiang.leetcode.array.dataStreamAsDisjointIntervals;

import cn.gaoyuexiang.leetcode.common.Interval;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SummaryRanges {
	private List<Interval> intervals;

	public SummaryRanges() {
		intervals = new ArrayList<>();
	}

	public void addNum(int val) {
		if (intervals.size() == 0) {
			intervals.add(new Interval(val, val));
			return;
		}
		boolean isFound = false;
		int n = intervals.size();
		for (int i = 0; i < n; i++) {
			Interval interval = intervals.get(i);
			if (val < interval.start - 1) {
				if (!isFound) intervals.add(i, new Interval(val, val));
				return;
			}
			if (val == interval.start - 1) {
				if (isFound) {
					intervals.get(i - 1).end = interval.end;
					intervals.remove(i);
					return;
				}
				interval.start = val;
				return;
			}
			if (val <= interval.end) return;
			if (val == interval.end + 1) {
				if (i + 1 == n) {
					interval.end = val;
					return;
				}
				isFound = true;
				interval.end = val;
			}
		}
		if (!isFound)
			intervals.add(new Interval(val, val));
	}

	public List<Interval> getIntervals() {
		return intervals;
	}

}
