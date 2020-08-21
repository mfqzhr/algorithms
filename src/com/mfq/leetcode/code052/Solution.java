package com.mfq.leetcode.code052;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int totalNQueens(int n) {
        return solveNQueens(n).size();
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        if (n <= 0) {
            return res;
        }
        ArrayList<String> list = new ArrayList<>();
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < n; i++) {
            s.append(".");
        }
        dfs(res, 0, list, n);

        return res;
    }

    private void dfs(List<List<String>> res, int row, ArrayList<String> list, int n) {
        if (row == n) {
            res.add(new ArrayList<String>(list));
            return;
        }
        for (int col = 0; col < n; col++) {
            if (!isValidate(row, col, list, n)) {
                continue;
            }
            char[] cur = new char[n];
            Arrays.fill(cur, '.');
            cur[col] = 'Q';
            list.add(new String(cur));
            dfs(res, row + 1, list, n);
            list.remove(list.size() - 1);
        }
    }

    private boolean isValidate(int row, int col, List<String> res, int n) {
        // 所在的列有没有皇后
        for (int i = 0; i < row; i++) {
            if (res.get(i).charAt(col) == 'Q') {
                return false;
            }
        }
        // 左上角
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i - row == j - col) {
                    if (res.get(i).charAt(j) == 'Q') {
                        return false;
                    }
                }
            }

        }
        // 右上角
        for (int i = 0; i < row; i++) {
            for (int j = n - 1; j > col; j--) {
                if (i - row == col - j) {
                    if (res.get(i).charAt(j) == 'Q') {
                        return false;
                    }
                }
            }
        }
        return true;
    }


}
