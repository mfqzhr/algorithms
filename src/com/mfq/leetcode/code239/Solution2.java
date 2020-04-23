package com.mfq.leetcode.code239;


import javax.naming.LinkLoopException;
import javax.xml.bind.annotation.XmlType;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/23 12:45
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution2 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        if (k == 1) {
            return nums;
        }
        int[] maxs = new int[nums.length - k + 1];
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
                deque.pollLast();
            }
            deque.offerLast(i);
            int w = i - k + 1;
            if (w < 0) {
                continue;
            }
            if (deque.peekFirst() < w) {
                deque.pollFirst();
            }
            maxs[w] = nums[deque.peekFirst()];
        }
        return maxs;
    }
}
