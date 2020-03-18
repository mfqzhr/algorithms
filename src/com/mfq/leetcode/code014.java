package com.mfq.leetcode;

public class code014 {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String res = strs[0];
        for (String s : strs) {
            while (s.indexOf(res) != 0) res = res.substring(0, res.length() - 1);
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
