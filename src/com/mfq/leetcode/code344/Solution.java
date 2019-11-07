package com.mfq.leetcode.code344;

/**
 * @author mufanqiang
 */
class Solution {
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        char temp;
        while (i <= j) {
            temp = s[i];
            s[i++] = s[j];
            s[j--] = temp;

        }
        for (int k = 0; k < s.length; k++) {
            System.out.print(s[k] + " ");
        }
    }

    public static void main(String[] args) {
        char[] s = {};
        new Solution().reverseString(s);
    }
}
