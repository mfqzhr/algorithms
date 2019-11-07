package com.mfq.leetcode.code28;

/**
 * @author mufanqiang
 */
public class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.equals("")) {
            return 0;
        }
        int i = haystack.indexOf(needle);
        return i;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().strStr("hello", "bba"));
    }
}
