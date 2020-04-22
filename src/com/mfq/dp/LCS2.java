package com.mfq.dp;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/21 19:27
 * @description：最长公共子串
 * @modified By：
 * @version: v1$
 */
public class LCS2 {
    public static void main(String[] args) {

    }

    static int lcs(String s1, String s2) {
        if (s1 == null || s2 == null) {
            return 0;
        }
        if (s1.length() == 0 || s2.length() == 0) {
            return 0;
        }
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        int max = 0;
        for (int i = 1; i <= chars1.length; i++) {
            for (int j = 1; j <= chars2.length; j++) {
                if (chars1[i - 1] == chars2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    max = Math.max(dp[i][j], max);
                }
            }
        }
        return max;
    }
}
