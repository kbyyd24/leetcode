package cn.gaoyuexiang.leetcode.mergesortedarray;

/**
 *
 * issues : #7
 *
 Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

 Note:
 You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.
 *
 */

public class Solution {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int  j = 0;
		for (int i = 0; j < n && i < m; i++) {
			if (nums1[i] > nums2[j]) {
				moveBack(nums1, m, i);
				nums1[i] = nums2[j];
				j++;
				m++;
			}
		}
		if (j < n) {
			for (int i = m; j < n; i++, j++) {
				nums1[i] = nums2[j];
			}
		}
	}

	private void moveBack(int[] nums1, int m, int i) {
		while (m > i) {
			nums1[m] = nums1[m - 1];
			m--;
		}
	}
}
