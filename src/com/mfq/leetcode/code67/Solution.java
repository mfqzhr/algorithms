package com.mfq.leetcode.code67;

public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder builder = new StringBuilder();
        int len = a.length() - b.length();
        String ext = "";
        char[] chars1;
        char[] chars2;
        for (int i = 0; i < Math.abs(len); i++) {
            ext += '0';
        }
        if (len >= 0) {
            ext += b;
            chars1 = ext.toCharArray();
            chars2 = a.toCharArray();
        } else {
            ext += a;
            chars2 = ext.toCharArray();
            chars1 = b.toCharArray();
        }
        int tag = 0;
        for (int i = ext.length() - 1; i >= 0; i--) {
            if (chars1[i] == '1' && chars2[i] == '1') {
                builder.append(0 + tag);
                tag = 1;
            } else if (chars1[i] == '0' && chars2[i] == '0') {
                builder.append(0 + tag);
                tag = 0;
            } else {
                int tag2 = tag == 0 ? 1 : 0;
                builder.append(tag2);
                tag = tag2 == 0 ? 1 : 0;
            }
        }
        if (tag == 1) {
            builder.append('1');
        }

        return builder.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().addBinary("0", "0"));
    }
}

