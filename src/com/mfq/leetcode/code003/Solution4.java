package com.mfq.leetcode.code003;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/8/21 16:54
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution4 {
    public int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0, max = 0;
        Set<Character> set = new HashSet<>();
        while (i < s.length() && j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
                max = Math.max(max, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return max;
    }
}
