package com.mfq.leetcode.code88;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/14 13:06
 * @description：\
 * @modified By：
 * @version: $
 */
public class Solution4 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0 || m == 0) {
            return;
        }
        int i = 0, j = 0, k = 0;
        int[] arr = new int[m + n];
        while (i < m && j < n) {
            arr[k++] = nums1[i] < nums2[j] ? nums1[i++] : nums2[j++];
        }
        while (i < m) {
            arr[k++] = nums1[i++];
        }
        while (j < n) {
            arr[k++] = nums2[j++];
        }
        for (int i1 = 0; i1 < arr.length; i1++) {
            nums1[i1] = arr[i1];
        }
    }
}
