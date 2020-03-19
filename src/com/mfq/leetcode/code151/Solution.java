package com.mfq.leetcode.code151;

public class Solution {
    public String reverseWords(String s) {
        if (s == null) {
            return new String();
        }
        if (s.length() == 0) {
            return "";
        }
        String[] strs = s.trim().split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = strs.length - 1; i > 0; i--) {
            if (strs[i].length() != 0) {
                builder.append(strs[i]).append(" ");
            }
        }
        builder.append(strs[0]);
        return builder.toString();
    }


    public static void main(String[] args) {
        System.out.println(new Solution().reverseWords("a           good   example"));
    }


}
