package com.mfq.leetcode.code051;

import java.util.*;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/5/6 23:35
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution2 {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        bt(new ArrayList<Integer>(), res, n);
        return res;
    }

    private void bt(List<Integer> currentQueen, List<List<String>> res, int n){
        //exit
        if(currentQueen.size() == n){
            List<String> temp = new ArrayList<>();
            for(int i = 0; i < n; i++){
                char[] t = new char[n];
                Arrays.fill(t, '.');
                t[currentQueen.get(i)] = 'Q';
                temp.add(new String(t));
            }
            res.add(temp);
            return;
        }

        for(int col = 0; col < n; col++){
            if(!currentQueen.contains(col)){
                if(checkDia(currentQueen, col)){
                    continue;
                }
                currentQueen.add(col);
                bt(currentQueen, res, n);
                currentQueen.remove(currentQueen.size() - 1);
            }
        }
    }

    private boolean checkDia(List<Integer> currentQueen, int col){
        int current_row = currentQueen.size();
        for(int row = 0; row < currentQueen.size(); row++){
            if(Math.abs(row - current_row) == Math.abs(col - currentQueen.get(row))){
                return true;
            }
        }
        return false;
    }
}
