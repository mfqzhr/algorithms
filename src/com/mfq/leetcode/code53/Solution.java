package com.mfq.leetcode.code53;


/**
 * @author 穆繁强
 * @date 2019/11/4
 */
public class Solution {
    public int maxSubArray(int[] nums) {

        return getMax(nums, 0, nums.length - 1);
    }

    private int getMax(int[] nums, int lo, int high) {
        int midSum = 0, leftSum = 0, rightSum = 0, sum = 0;
        int center, lefts, rights, s1, s2;
        if (lo == high) {
            return nums[lo];
        } else {
            center = (high - lo) / 2 + lo;
            leftSum = getMax(nums, lo, center);
            rightSum = getMax(nums, center + 1, high);
            lefts = 0;
            s1 = Integer.MIN_VALUE;
            for (int i = center; i >= lo; i--) {
                lefts += nums[i];
                if (s1 < lefts) {
                    s1 = lefts;
                }
            }

            rights = 0;
            s2 = Integer.MIN_VALUE;
            for (int i = center + 1; i <= high; i++) {
                rights += nums[i];
                if (s2 < rights) {
                    s2 = rights;
                }
            }
            midSum = s1 + s2;
            if (midSum < leftSum) {
                sum = leftSum;
            } else {
                sum = midSum;
            }
            if (sum < rightSum) {
                sum = rightSum;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(new Solution().maxSubArray(arr));
    }
}
