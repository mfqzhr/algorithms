package com.mfq.leetcode.code007;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.Random;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/8/23 17:24
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution {
    public int reverse(int x) {

        StringBuilder builder = new StringBuilder();
        builder.append(x);
        String s = "";
        if (builder.charAt(0) == '-') {
            s = builder.reverse().substring(0, builder.length() - 1);
            s = "-" + s;
        } else {
            s = builder.reverse().toString();
        }
        if (s.length() == 10 && s.charAt(0) != '-') {
            int i = Integer.parseInt(s.substring(0, s.length() - 1));
            if (i > 214748364) {
                return 0;
            } else if (i == 214748364) {
                if ((s.charAt(s.length() - 1) - '0') > 8) {
                    return 0;
                }

            }
        }

        if (s.length() == 11 && s.charAt(0) == '-') {
            int i = Integer.parseInt(s.substring(1, s.length() - 1));
            if (i > 214748364) {
                return 0;
            } else if (i == 214748364) {
                if ((s.charAt(s.length() - 1) - '0') > 7) {
                    return 0;
                }

            }

        }
        return Integer.parseInt(s);

    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int i1 = new Random().nextInt(Integer.MAX_VALUE);
            System.out.println(i1);
            System.out.println(new Solution().reverse(i1));
            System.out.println("---------------");
        }
    }


}
