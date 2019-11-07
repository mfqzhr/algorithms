package com.mfq.leetcode.demo8;

import com.mfq.array.Array;

import java.math.BigInteger;
import java.util.Arrays;

public class Solution {
    public int[] plusOne(int[] digits) {
        String s = "";
        for (int i = 0; i < digits.length; i++) {
            s += digits[i];

        }
        BigInteger bigInteger = new BigInteger(s);
        bigInteger = bigInteger.add(new BigInteger("1"));

        int len = String.valueOf(bigInteger).length();
        int[] newDigits = new int[len];
        for (int i = 0; i < len; i++) {
            BigInteger num1 = (BigInteger) bigInteger.remainder(BigInteger.valueOf(10));
            newDigits[len - 1 - i] = num1.intValue();
            bigInteger = bigInteger.divide(BigInteger.valueOf(10));

        }
        return newDigits;

    }

    public static void main(String[] args) {
        int[] nums = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
        System.out.println(Arrays.toString(new Solution().plusOne(nums)));

    }

}
