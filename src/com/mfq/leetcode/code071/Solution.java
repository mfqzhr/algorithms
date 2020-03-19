package com.mfq.leetcode.code071;

import java.util.Stack;

public class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] strs = path.split("/");
        for (String str : strs) {
            if (!stack.isEmpty() && str.equals("..")) {
                stack.pop();
            } else if (!str.equals("") && !str.equals(".") && !str.equals("..")) {
                stack.push(str);
            }
        }
        if (stack.isEmpty()) {
            return "/";
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < stack.size(); i++) {
            res.append("/").append(stack.get(i));
        }

        return res.toString();
    }
}
