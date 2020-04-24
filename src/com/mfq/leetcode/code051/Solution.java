package com.mfq.leetcode.code051;

import com.mfq.leetcode.code75.Solution4;

import java.util.Arrays;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/24 10:47
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution {
    int[] help = null;
    int count = 0;

    public int reversePairs(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }
        help = new int[nums.length];
        mergeSort(nums, 0, nums.length - 1);

        return count;
    }

    /**
     * 计算逆序对的个数并且排序
     *
     * @param nums
     * @param lo
     * @param hi
     */
    private void mergeSort(int[] nums, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int mid = lo + ((hi - lo) >> 1);
        mergeSort(nums, lo, mid);
        mergeSort(nums, mid + 1, hi);
        merge(nums, lo, mid, hi);
    }

    private void merge(int[] nums, int lo, int mid, int hi) {
        for (int i = lo; i <= hi; i++) {
            help[i] = nums[i];
        }
        int i = lo, j = mid + 1, k = lo;
        while (i <= mid && j <= hi) {
            if (help[i] <= help[j]) {
                nums[k++] = help[i++];
            } else {
                nums[k++] = help[j++];
                count += (mid - i + 1);
            }
        }
        while (i <= mid) {
            nums[k++] = help[i++];
        }
        while (j <= hi) {
            nums[k++] = help[j++];
        }

    }

    public static void main(String[] args) {
        int[] num = new int[]{2, 1, 3, 4};
        new Solution().reversePairs(num);
        System.out.println(Arrays.toString(num));
    }
}
