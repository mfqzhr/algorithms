package com.mfq.leetcode.code059;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/5/23 18:47
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution {
    int num = 1;
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        process(res, 0, 0);
        return res;
    }
    private void process(int[][] res, int i, int j) {
        if (i < 0 || i > res.length - 1 || j < 0 || j > res.length - 1 || res[i][j] != 0) {
            return;
        }
        res[i][j] = num++;
        if (i - 1 >= 0 && res[i - 1][j] == 0) {

        } else {
            process(res, i, j + 1);
        }
        process(res, i + 1, j);
        process(res, i, j - 1);
        process(res, i - 1, j);
    }
}
