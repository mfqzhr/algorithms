package com.mfq.leetcode.code093;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> restoreIpAddresses(String s) {
        int len = s.length();
        List<String> res = new ArrayList<>();
        if (len < 4 || len > 12) {
            return res;
        }
        List<String> path = new ArrayList<>();
        int splitTimes = 0;
        dfs(s, len, splitTimes, 0, path, res);
        return res;
    }

    private int validate(String s, int left, int right) {
        int len = right - left + 1;
        if (left > 1 && s.charAt(left) == '0') {
            return -1;
        }
        int res = 0;
        for (int i = left; i <= right; i++) {
            res = res * 10 + s.charAt(i) - '0';
        }
        if (res > 255) {
            return -1;
        }
        return res;
    }

    private void dfs(String s, int len, int split, int begin, List<String> path, List<String> res) {


    }


}
