package cn.gaoyuexiang.leetcode.array.dataStreamAsDisjointIntervals;

import cn.gaoyuexiang.leetcode.common.Interval;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class SummaryRangesTest {
	
	private SummaryRanges summaryRanges = new SummaryRanges();

	@Test
	public void should_return_tow_intervals() throws Exception {
		int[] vals = {1, 3, 7, 2, 6};
		for (int val :
						vals) {
			summaryRanges.addNum(val);
		}
		List<Interval> assertList = new LinkedList<>();
		assertList.add(new Interval(1, 3));
		assertList.add(new Interval(6, 7));
		List<Interval> intervals = summaryRanges.getIntervals();
		assertEquals(assertList, intervals);
	}
}