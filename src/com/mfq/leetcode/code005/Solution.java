package com.mfq.leetcode.code005;

import com.mfq.leetcode.code004.Solution1;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/8/22 16:01
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution {
    public String longestPalindrome(String s) {
        String help = "#";
        for (int i = 0; i < s.length(); i++) {
            help = help + s.charAt(i) + "#";
        }
        String res = "";
        for (int i = 0; i < help.length(); i++) {
            String temp = help(i, help);
            res = temp.length() > res.length() ? temp : res;
        }
        String ret = "";
        for (int i = 0; i < res.length(); i++) {
            if (res.charAt(i) != '#') {
                ret += res.charAt(i);
            }
        }

        return ret;
    }

    private String help(int i, String help) {
        int j = i - 1, k = i + 1;
        String res = help.charAt(i) + "";
        while (j >= 0 && k < help.length()) {
            if (help.charAt(j) == help.charAt(k)) {
                res = help.charAt(j) + res + help.charAt(k);
                j--;
                k++;
            } else {
                return res;
            }

        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().longestPalindrome("babad"));
    }
}
