package com.mfq.leetcode.code003;

import javax.security.auth.callback.CallbackHandler;
import java.util.HashSet;
import java.util.Set;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/22 20:54
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution2 {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        Set<Character> set = new HashSet<>();
        int i = 0, j = 0, max = 0;
        while (i < s.length() && j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                max = Math.max(j - i, max);
            } else {
                set.remove(s.charAt(i++));
            }
        }

        return max;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(new Solution2().lengthOfLongestSubstring(s));
    }
}
