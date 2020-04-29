package com.mfq.leetcode.code125;

import com.mfq.leetcode.code121.Solution2;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/29 17:10
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        s = s.toLowerCase();
        while (i < s.length() && j >= 0) {
            while (i < s.length() && (s.charAt(i) > 'z' || s.charAt(i) < 'a')
                    && (s.charAt(i) < '0' || s.charAt(i) > '9')) {
                i++;
            }
            while (j >= 0 && (s.charAt(j) > 'z' || s.charAt(j) < 'a')
                    && (s.charAt(j) < '0' || s.charAt(j) > '9')) {
                j--;
            }
            if (i < s.length() && j >= 0 && s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        new Solution().isPalindrome("OP");
    }
}
