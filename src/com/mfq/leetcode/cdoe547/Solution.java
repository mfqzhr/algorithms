package com.mfq.leetcode.cdoe547;

public class Solution {

    public int findCircleNum(int[][] M) {
        int[] visited = new int[M.length];
        int count = 0;
        for (int i = 0; i < M.length; i++) {
            if (visited[i] == 0) {
                dfs(M, visited, i);
                count++;
            }
        }
        return count;
    }

    private void dfs(int[][] m, int[] visited, int i) {
        for (int j = 0; j < m.length; j++) {
            if (visited[j] == 0 && m[i][j] == 1) {
                visited[j] = 1;
                dfs(m, visited, j);
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        System.out.println(new Solution().findCircleNum(arr));
    }
}
