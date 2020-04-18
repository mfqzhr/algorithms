package com.mfq.leetcode.code16;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/15 9:29
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution2 {
    public int[] subSort(int[] array) {
        if (array.length == 0) {
            return new int[]{-1, -1};
        }
        int max = array[0];
        int r = -1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
            } else {
                r = i;
            }
        }
        int min = array[array.length - 1];
        int l = -1;
        for (int i = array.length - 2; i >= 0; i--) {
            if (array[i] <= min) {
                min = array[i];
            } else {
                l = i;
            }
        }

        return new int[]{l, r};
    }
}
