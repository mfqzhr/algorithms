package com.mfq.leetcode.code048;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0, res = 0;
        HashSet<Character> set = new HashSet<>();
        while (i < s.length() && j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                res = Math.max(res, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return res;
    }

}
