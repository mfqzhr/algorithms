package com.mfq.leetcode.code455;

import java.util.Arrays;

/**
 * @author 穆繁强
 * @date 2019/12/13
 */
public class Solution2 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0, j = 0;
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                i++;
            }
            j++;
        }
        return i;
    }
}
