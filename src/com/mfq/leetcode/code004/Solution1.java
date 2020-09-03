package com.mfq.leetcode.code004;

import java.util.Arrays;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/8/22 14:13
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution1 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length;
        double mid1 = 0, mid2 = 0;
        if (len1 != 0) {
            if (len1 % 2 == 0) {
                mid1 = (nums1[len1 / 2] + nums1[(len1 - 1) / 2]) / 2.0;
            } else {
                mid1 = nums1[len1 / 2];
            }
        }

        if (len2 != 0) {

            if (len2 % 2 == 0) {
                mid2 = (nums2[len2 / 2] + nums2[(len2 - 1) / 2]) / 2.0;
            } else {
                mid2 = nums2[len2 / 2];
            }
        }
        if (len1 == 0) {
            return mid2;
        }
        if (len2 == 0) {
            return mid1;
        }

        return (mid1 + mid2) / 2.0;
    }

    public static void main(String[] args) {
        new Solution1().findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4});
    }
}
