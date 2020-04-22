package com.mfq.leetcode.code022;

import com.sun.deploy.security.BadCertificateDialog;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/22 11:40
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution {
    List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        help(n, n, "");
        return res;
    }

    private void help(int left, int right, String s) {
        if (left == 0 && right == 0) {
            res.add(s);
            return;
        }
        if (left > 0) {
            help(left - 1, right, s + "(");
        }

        if (right > left) {
            help(left, right - 1, s + ")");
        }
    }
}
