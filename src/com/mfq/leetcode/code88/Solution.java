package com.mfq.leetcode.code88;

import java.util.Arrays;

public class Solution {

    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[i + m] = nums2[i];
        }

        Arrays.sort(nums1);
        System.out.print(nums1[0]);
        for (int i = 1; i < nums1.length; i++) {
            System.out.print("," + nums1[i]);
        }
    }


    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = 0, p2 = 0;
        while (p1 < m || p2 < n) {
            if (nums1[p1] < nums2[p2]) {
                p1++;
            } else {
                nums1[p1] = nums2[p2];
                p2++;
            }

        }
        System.out.print(nums1[0]);
        for (int i = 1; i < nums1.length; i++) {
            System.out.print("," + nums1[i]);
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        new Solution().merge(nums1, 3, nums2, 3);
    }

}
