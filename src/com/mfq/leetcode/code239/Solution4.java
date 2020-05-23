package com.mfq.leetcode.code239;


import java.util.LinkedList;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/5/23 13:38
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution4 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length - k + 1];
        if (nums == null) {
            return res;
        }
        if (nums.length == 0) {
            return res;
        }

        LinkedList<Integer> list = new LinkedList<>();
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            while (!list.isEmpty() && (nums[list.getLast()] <= nums[i])) {
                list.removeLast();
            }
            list.addLast(i);
            if (i - k == list.getFirst()) {
                list.removeFirst();
            }
            if (i - k >= -1) {
                res[index++] = nums[list.getFirst()];
            }
        }
        return res;
    }
}
