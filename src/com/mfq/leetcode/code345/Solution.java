package com.mfq.leetcode.code345;

import java.util.Stack;

public class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' ||
                    chars[i] == 'u' || chars[i] == 'A' || chars[i] == 'E' || chars[i] == 'I' ||
                    chars[i] == 'O' || chars[i] == 'U') {
                stack.push(chars[i]);
            }

        }

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' ||
                    chars[i] == 'u' || chars[i] == 'A' || chars[i] == 'E' || chars[i] == 'I' ||
                    chars[i] == 'O' || chars[i] == 'U') {
                chars[i] = stack.pop();
            }

        }


        return String.valueOf(chars);

    }


    public static void main(String[] args) {
        System.out.println(new Solution().reverseVowels("leetcode"));
    }
}
