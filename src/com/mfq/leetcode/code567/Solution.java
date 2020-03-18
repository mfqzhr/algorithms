package com.mfq.leetcode.code567;

import java.util.Arrays;

public class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        char[] temp = new char[chars1.length];
        Arrays.sort(chars1);
        for (int i = 0; i <= chars2.length -chars1.length; i++) {
            for (int j = 0; j < chars1.length; j++) {
                temp[j] = chars2[i + j];
            }
            Arrays.sort(temp);
            if (Arrays.equals(temp, chars1)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().checkInclusion("abc", "bbbca"));
    }
}
