package com.mfq.leetcode.code003;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/25 0:03
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        if (s == null) {
            return 0;
        }
        if (s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        Set<Character> set = new HashSet<>();
        int i = 0, j = 0, max = 0;
        while (i < s.length() && j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                max = Math.max(max, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return max;
    }
}
