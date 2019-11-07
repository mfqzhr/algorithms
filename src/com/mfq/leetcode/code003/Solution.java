package com.mfq.leetcode.code003;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 穆繁强
 * @date 2019/9/30
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0, res = 0;
        char[] chars = s.toCharArray();
        Set<Character> set = new HashSet<>();
        while (i < chars.length && j < chars.length) {
            if (!set.contains(chars[j])) {
                set.add(chars[j++]);
                res = Math.max(res, j - i);
            } else {
                set.remove(chars[i++]);
            }

        }

        return res;

    }
}