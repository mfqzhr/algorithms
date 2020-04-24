package com.mfq.leetcode.code739;

import java.util.Stack;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/24 20:18
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution {
    public int[] dailyTemperatures(int[] T) {
        if (T == null || T.length == 0) {
            return new int[]{};
        }
        int[] res = new int[T.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < T.length; i++) {
            while (!stack.isEmpty() && T[i] > T[stack.peek()]) {
                res[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
        }

        return res;
    }
}
