package com.mfq.leetcode.code033;

public class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        return binarySearch(nums, 0, nums.length - 1, target);
    }

    private int binarySearch(int[] arr, int lo, int hi, int key) {
        while (lo <= hi) {
            int mid = lo + (hi - lo) >>> 1;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[lo] <= arr[mid]) {//左边有序
                if (key < arr[mid] && key >= arr[lo]) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            } else {//右边有序
                if (arr[mid] < key && arr[hi] >= key) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }

            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{4, 5, 6, 7, 0, 1, 2};
        System.out.println(new Solution().search(arr, 0));
    }
}
