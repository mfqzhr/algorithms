package com.mfq.leetcode.code200;


/**
 * @author 穆繁强
 * @date 2019/10/13
 */
public class Solution {
    public int numIslands1(char[][] grid) {
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    res++;
                    help(grid, i, j);
                }
            }
        }
        return res;
    }

    private void help(char[][] grid, int i, int j) {
        if (i < 0 || i > grid.length - 1 || j < 0 || j > grid[0].length - 1 || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        help(grid, i + 1, j);
        help(grid, i, j - 1);
        help(grid, i, j + 1);
        help(grid, i, j - 1);

    }


    public int numIslands(char[][] grid) {
        if (grid == null || grid.length <= 0) {
            return 0;
        }
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    res++;
                    infect(grid, i, j, grid.length, grid[0].length);

                }

            }

        }

        return res;

    }

    private void infect(char[][] grid, int i, int j, int N, int M) {
        if (i < 0 || i >= N || j < 0 || j >= M || grid[i][j] != '1') {
            return;
        }

        grid[i][j] = '2';
        infect(grid, i + 1, j, N, M);
        infect(grid, i - 1, j, N, M);
        infect(grid, i, j + 1, N, M);
        infect(grid, i, j - 1, N, M);

    }

    public static void main(String[] args) {
        char[][] nums = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}

        };
        System.out.println(new Solution().numIslands1(nums));
    }

}
