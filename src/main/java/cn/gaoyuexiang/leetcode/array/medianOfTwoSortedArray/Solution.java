package cn.gaoyuexiang.leetcode.array.medianOfTwoSortedArray;

/**
 * issues : #23
 */

public class Solution {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int len = nums1.length + nums2.length;
		double ret = findMedian(nums1, nums2, 0, 0, len / 2 + 1);
		if (len % 2 == 0) {
			ret += findMedian(nums1, nums2, 0, 0, len / 2);
			ret = ret / 2;
		}
		return ret;
	}

	private double findMedian(int[] nums1, int[] nums2, int arr1Start, int arr2Start, int k) {
		if (arr1Start >= nums1.length) {
			return nums2[arr2Start + k - 1];
		}
		if (arr2Start >= nums2.length) {
			return nums1[arr1Start + k - 1];
		}
		if (k == 1) {
			return nums1[arr1Start] < nums2[arr2Start] ? nums1[arr1Start] : nums2[arr2Start];
		}
		int mid = k / 2;
		int pre1 = arr1Start + mid - 1 >= nums1.length ?
						Integer.MAX_VALUE : nums1[arr1Start + mid - 1];
		int pre2 = arr2Start + mid - 1 >= nums2.length ?
						Integer.MAX_VALUE : nums2[arr2Start + mid - 1];
		if (pre1 > pre2) {
			return findMedian(nums1, nums2, arr1Start, arr2Start + mid, k - mid);
		}
		return findMedian(nums1, nums2, arr1Start + mid, arr2Start, k - mid);
	}
}
