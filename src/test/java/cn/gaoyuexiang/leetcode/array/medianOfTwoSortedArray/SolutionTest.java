package cn.gaoyuexiang.leetcode.array.medianOfTwoSortedArray;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void should_return_right_median() throws Exception {
		int[] nums1 = {1, 6, 7, 8, 9};
		int[] nums2 = {2, 3, 4, 5};
		double expect = 5;
		double actual = solution.findMedianSortedArrays(nums1, nums2);
		assertEquals(expect, actual, 0.1);
	}
}