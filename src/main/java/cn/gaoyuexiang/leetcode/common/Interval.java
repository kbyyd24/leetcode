package cn.gaoyuexiang.leetcode.common;

public class Interval {
	public int start;
	public int end;
	public Interval(int s, int e) {
		this.start = s;
		this.end = e;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Interval interval = (Interval) o;

		if (start != interval.start) return false;
		return end == interval.end;

	}

	@Override
	public int hashCode() {
		int result = start;
		result = 31 * result + end;
		return result;
	}
}
