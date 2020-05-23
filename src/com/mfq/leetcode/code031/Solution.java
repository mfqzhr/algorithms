package com.mfq.leetcode.code031;


import com.mfq.array.Array;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/5/6 23:15
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution {
    public void nextPermutation(int[] nums) {
        if (nums == null) {
            return;
        }
        if (nums.length == 0) {
            return;
        }
        boolean b = true;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) {
                b = false;
            }
        }
        if (b) {
            Arrays.sort(nums);
        } else {
            process(nums, 0, nums.length - 1);
        }
    }

    private void process(int[] nums, int start, int end) {
        if (end == 0) {
            return;
        }
        if (start == nums.length - 1) {
            return;
        }

        for (int j = end - 1; j >= 0; j--) {
            if (nums[j] < nums[end]) {
                int temp = nums[j];
                nums[j] = nums[end];
                nums[end] = temp;
                process(nums, start + 1, end);
            }
        }
        process(nums, start, end - 1);
    }

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            int[] ints = new int[3];
            for (int j = 0; j < 3; j++) {
                ints[0] = new Random().nextInt(100);
                ints[1] = new Random().nextInt(100);
                ints[2] = new Random().nextInt(100);
            }
            System.out.println(Arrays.toString(ints));
            new Solution().nextPermutation(ints);
            System.out.println(Arrays.toString(ints));
            System.out.println("----------------------");
        }


    }
}
