package com.mfq.leetcode.code633;

public class Solution {
    public boolean judgeSquareSum(int c) {
        int a = 0, b = (int) Math.sqrt((double) c);
        while (a <= b) {
            if (a * a + b * b == c) {
                return true;
            } else if (a * a + b * b < c) {
                a++;
            } else if (a * a + b * b > c) {
                b--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().judgeSquareSum(3));
    }

}
