package com.mfq.leetcode.code88;

/**
 * @author 穆繁强
 * @date 2019/12/3
 */
public class Solution2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

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
        for (int l = 0; l < arr.length; l++) {
            nums1[l] = arr[l];
            System.out.println(nums1[l]);
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};

        new Solution2().merge(nums1, 3, nums2, 3);
    }

}
