package com.mfq.leetcode.code704;

/**
 * @author mufanqiang
 */
public class Solution {
    public int search(int[] nums, int target) {
        return binarySearch0(nums, 0, nums.length, target);
    }

    private static int binarySearch0(int[] a, int fromIndex, int toIndex,
                                     long key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            long midVal = a[mid];

            if (midVal < key) {
                low = mid + 1;
            } else if (midVal > key) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().search(new int[]{1,2}, 2));
    }
}
