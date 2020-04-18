package com.mfq.leetcode.code977;

import java.util.Arrays;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/15 9:39
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution {
    public int[] sortedSquares(int[] A) {
        if (A.length == 1) {
            return new int[]{A[0] * A[0]};
        }
        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] * A[i];
        }
        Arrays.sort(A);
        return A;
    }
}
