package com.mfq.leetcode.code151;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/24 23:23
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution2 {
    public String reverseWords(String s) {
        if (s == null) {
            return null;
        }
        if (s.length() == 0) {
            return "";
        }
        String[] strings = s.trim().split(" ");
        String res = "";
        for (int i = strings.length - 1; i > 0; i--) {
            if (strings[i].length() != 0)
                res += (strings[i] + " ");
        }
        return res + strings[0];
    }
}
