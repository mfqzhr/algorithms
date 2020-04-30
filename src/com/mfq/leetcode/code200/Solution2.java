package com.mfq.leetcode.code200;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/29 23:56
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution2 {
    public int numIslands(char[][] grid) {
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    res += 1;
                    infect(grid, i, j);
                }
            }
        }
        return res;
    }

    private void infect(char[][] grid, int i, int j) {
        if (i < 0 || i > grid.length - 1 || j < 0 || j > grid[0].length - 1 || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        infect(grid, i + 1, j);
        infect(grid, i - 1, j);
        infect(grid, i, j + 1);
        infect(grid, i, j - 1);
    }
}
