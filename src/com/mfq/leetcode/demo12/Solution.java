package com.mfq.leetcode.demo12;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Character, Integer> map, map1;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            map = new HashMap();
            for (int j = 0; j < 9; j++) {
                if (map.containsKey(board[i][j])) {
                    return false;
                } else {
                    map.put(board[i][j],1);
                }
            }
            map1 = new HashMap<>();
            for (int j = 0; j < 9; j++) {
                if (map1.containsKey(board[j][i])) {
                    return false;
                } else {
                    map.put(board[j][i],1);
                }

            }
            
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j = j * 3) {

            }

        }
        return true;
    }
}
