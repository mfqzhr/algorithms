package com.mfq.leetcode.code054;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/5/23 17:58
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        if (matrix == null) {
            return null;
        }

        if (matrix.length == 0) {
            return null;
        }

        List<Integer> res = new ArrayList<>();

        process(res, matrix, 0, 0);

        return res;
    }

    private void process(List<Integer> res, int[][] matrix, int i, int j) {
        if (i > matrix.length - 1 || i < 0 || j > matrix[0].length - 1 || j < 0 || matrix[i][j] == Integer.MIN_VALUE) {
            return;
        }
        res.add(matrix[i][j]);
        matrix[i][j] = Integer.MIN_VALUE;
        if (i - 1 >= 0 && matrix[i - 1][j] != Integer.MIN_VALUE) {

        } else {
            process(res, matrix, i, j + 1);
        }
        process(res, matrix, i + 1, j);
        process(res, matrix, i, j - 1);
        process(res, matrix, i - 1, j);


    }


}
