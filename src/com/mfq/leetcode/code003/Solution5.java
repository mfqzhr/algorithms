package com.mfq.leetcode.code003;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/8/22 14:03
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution5 {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.equals("")) {
            return 0;
        }
        char[] chars = s.toCharArray();
        int[] map = new int[256];
        for (int i = 0; i < 256; i++) {
            map[i] = -1;
        }
        int len = 0;
        int pre = -1;
        int cur = 0;
        for (int i = 0; i != chars.length; i++) {
            pre = Math.max(pre, map[chars[i]]);
            cur = i - pre;
            len = Math.max(len, cur);
            map[chars[i]] = i;
        }

        return len;
    }
}
