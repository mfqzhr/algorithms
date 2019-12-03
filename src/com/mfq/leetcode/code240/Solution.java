package com.mfq.leetcode.code240;

import java.util.Arrays;

/**
 * @author 穆繁强
 * @date 2019/12/3
 */
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0, j = matrix.length - 1;
        while (j >= 0 && i < matrix[0].length) {
            if (matrix[j][i] > target) {
                j--;
            } else if (matrix[j][i] < target) {
                i++;
            } else {
                return true;
            }
        }
        return false;
    }

}
