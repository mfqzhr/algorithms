package com.mfq.leetcode.code131;

import java.util.LinkedList;
import java.util.List;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/5/23 19:34
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new LinkedList<>();

        if (s == null) {
            return res;
        }
        if (s.length() == 0) {
            return res;
        }
        dfs(s, new LinkedList<String>(), res, 0);

        return res;
    }

    private void dfs(String s, LinkedList<String> linkedList, List<List<String>> res, int index) {
        if (index == s.length()) {
            res.add(new LinkedList<>(linkedList));
            return;
        }
        for (int i = index; i < s.length(); i++) {
            String temp = s.substring(index, i + 1);
            if (!isValidate(temp))
                continue;

            linkedList.add(temp);
            dfs(s, linkedList, res, i + 1);
            linkedList.removeLast();

        }

    }


    public boolean isValidate(String temp) {
        int i = 0, j = temp.length() - 1;
        while (i < j) {
            if (temp.charAt(i) != temp.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().partition("aab"));
    }
}
