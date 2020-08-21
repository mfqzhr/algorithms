package com.mfq.leetcode.code022;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/5/23 21:32
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution2 {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        if (n == 0) {
            return res;
        }
        dfs(n, "", n, n, res);
        return res;
    }

    private void dfs(int n, String cur, int left, int right, List<String> res) {
        if (0 == left && 0 == right) {
            res.add(cur);
            return;
        }

        if (left > right) {
            return;
        }

        if (left > 0) {
            dfs(n, cur + "(", left - 1, right, res);
        }

        if (right > 0) {
            dfs(n, cur + ")", left, right - 1, res);
        }
    }
}
