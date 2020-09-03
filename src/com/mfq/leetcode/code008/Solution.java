package com.mfq.leetcode.code008;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/8/24 8:26
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution {
    public int myAtoi(String str) {

        str = str.trim();
        if (str.length() == 0) {
            return 0;
        }
        if (((str.charAt(0) - '0') < 0) || ((str.charAt(0) - '0') > 9)) {
            if (str.charAt(0) == '-' || str.charAt(0) == '+') {

            } else {
                return 0;
            }
        }
        StringBuilder s = new StringBuilder();
        if (str.charAt(0) == '-' || str.charAt(0) == '+') {
            s.append(addNumber(1, str));
        } else {
            s.append(addNumber(0, str));
        }
        if (s.length() >= 10 && s.charAt(0) != '-') {
            if (s.length() > 10) {
                return Integer.MAX_VALUE;
            }
            int i = Integer.parseInt(s.substring(0, s.length() - 1));
            if (i > (Integer.MAX_VALUE / 10)) {
                return Integer.MAX_VALUE;
            } else if (i == (Integer.MAX_VALUE / 10)) {
                if (Integer.parseInt(s.substring(s.length() - 1)) > (Integer.MAX_VALUE % 10)) {
                    return Integer.MAX_VALUE;
                }
            }
        }
        if (s.length() >= 11 && s.charAt(0) == '-') {
            if (s.length() > 11) {
                return Integer.MIN_VALUE;
            }
            int i = Integer.parseInt(s.substring(1, s.length() - 1));
            if (i > (Integer.MAX_VALUE / 10)) {
                return Integer.MIN_VALUE;
            } else if (i == (Integer.MAX_VALUE / 10)) {
                if (Integer.parseInt(s.substring(s.length() - 1)) > (Integer.MAX_VALUE % 10 + 1)) {
                    return Integer.MIN_VALUE;
                }
            }
        }
        if (s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            if (s.charAt(0) == '-')
                return 0;
        }

        return Integer.parseInt(s.toString());
    }

    private String addNumber(int i, String str) {
        int j, k;
        String res = "";
        for (j = i; j < str.length(); j++) {
            if (((str.charAt(j) - '0') < 0) || ((str.charAt(j) - '0') > 9)) {
                break;
            }
        }
        if (str.charAt(0) == '-' || str.charAt(0) == '+') {
            for (k = 1; k < str.length(); k++) {
                if (str.charAt(k) != '0') {
                    break;
                }
            }
            res = str.charAt(0) == '-' ? "-" + str.substring(k, j) : str.substring(k, j);
        } else {
            for (k = 0; k < str.length(); k++) {
                if (str.charAt(k) != '0') {
                    break;
                }
            }
            res = str.substring(k, j);
        }

        return res;

    }



    public static void main(String[] args) {
        System.out.println(new Solution().myAtoi("2147483646"));
        System.out.println(new Solution().myAtoi("-42"));
        System.out.println(new Solution().myAtoi("42"));
        System.out.println(new Solution().myAtoi("4193 with words"));
        System.out.println(new Solution().myAtoi("words and 987"));
        System.out.println(new Solution().myAtoi("-91283472332"));
        System.out.println(new Solution().myAtoi("-"));
        System.out.println(new Solution().myAtoi("-------------"));
        System.out.println(new Solution().myAtoi("+"));
        System.out.println(new Solution().myAtoi("+++++++++++++++++++++"));
        System.out.println(new Solution().myAtoi("000000000000000123"));
        System.out.println(new Solution().myAtoi("-000000000000000123"));
    }
}
