package com.mfq.leetcode.code004;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/30 14:28
 * @description：
 * @modified By：
 * @version: $
 */
public class Soluiton {
    public  double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] help = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) {
            help[k++] = nums1[i] < nums2[j] ? nums1[i++] : nums2[j++];
        }
        while (i < nums1.length) {
            help[k++] = nums1[i++];
        }
        while (j < nums2.length) {
            help[k++] = nums2[j++];
        }
        int mid = help.length / 2;
        return help.length % 2 == 0 ?
                ((help[mid] + help[mid - 1]) / 2.0) :
                (double) help[mid];
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2};
        int[] arr2 = new int[]{3, 4};
    }
}
