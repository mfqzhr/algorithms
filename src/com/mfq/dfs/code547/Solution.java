package com.mfq.dfs.code547;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/22 23:14
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution {
    public int findCircleNum(int[][] M) {
        int[][] visited = new int[M.length][M.length];
        int count = 0;
        for (int i = 0; i < M.length; i++) {
            if (visited[i][0] == 0) {
                dfs(visited, i, M);
                count++;
            }
        }
        return count;
    }

    private void dfs(int[][] visited, int i, int[][] m) {
        for (int j = 0; j < m.length; j++) {
            if (visited[i][j] == 0 && m[i][j] == 1) {
                visited[i][j] = 1;
                dfs(visited, j, m);
            }
        }
    }
}
