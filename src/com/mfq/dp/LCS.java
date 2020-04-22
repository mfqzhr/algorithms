package com.mfq.dp;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/21 16:18
 * @description：最长公共子序列
 * @modified By：
 * @version: v1$
 */
public class LCS {
    public static void main(String[] args) {

    }

    public int longestCommonSubsequence(String text1, String text2) {
        char[] chars = text1.toCharArray();
        char[] chars1 = text2.toCharArray();
        return lcs2(chars, chars1);

    }

    public static int lcs1(int[] n1, int[] n2) {
        if (n1 == null || n1.length == 0) return 0;
        if (n2 == null || n2.length == 0) return 0;
        return lcs1(n1, n1.length, n2, n2.length);
    }

    public static int lcs2(char[] n1, char[] n2) {
        if (n1 == null || n1.length == 0) return 0;
        if (n2 == null || n2.length == 0) return 0;
        int[][] dp = new int[2][n2.length + 1];
        for (int i = 1; i <= n1.length; i++) {
            int cur = i % 2;
            int pre = (i - 1) % 2;
            for (int j = 1; j <= n2.length; j++) {
                if (n1[i - 1] == n2[j - 1]) {
                    dp[cur][j] = dp[pre][j - 1] + 1;
                } else {
                    dp[cur][j] = Math.max(dp[pre][j], dp[cur][j - 1]);
                }
            }

        }
        return dp[n1.length % 2][n2.length];
    }

    /**
     * 求nums1和 nums2 前 i j 个最长公共子序列长度
     *
     * @param n1
     * @param i
     * @param n2
     * @param j
     * @return
     */
    public static int lcs1(int[] n1, int i, int[] n2, int j) {
        if (i == 0 || j == 0) {
            return 0;
        }
        if (n1[i - 1] == n2[j - 1]) {
            return lcs1(n1, i - 1, n2, j - 1) + 1;
        }
        return Math.max(
                lcs1(n1, i - 1, n2, j),
                lcs1(n1, i, n2, j - 1));
    }
}
