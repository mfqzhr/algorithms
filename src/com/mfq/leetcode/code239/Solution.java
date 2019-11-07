package com.mfq.leetcode.code239;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author mufanqiang
 * 滑动窗口的位置                最大值
 * ---------------               -----
 */
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length < 1 || k < 1) {
            return new int[]{};
        }
        int index = 0;
        LinkedList<Integer> list = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];
        for (int i = 0; i < nums.length; i++) {
            while (!list.isEmpty() && (nums[list.getLast()] <= nums[i])) {
                list.pollLast();
            }
            list.addLast(i);
            if (list.peekFirst() == i - k) {
                list.pollFirst();
            }
            if (i >= k - 1) {
                res[index++] = nums[list.peekFirst()];
            }


        }

        return res;

    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        System.out.println(Arrays.toString(new Solution().maxSlidingWindow(nums, 0)));
    }
}