package com.mfq.leetcode.code999;

import javafx.scene.control.cell.CheckBoxListCell;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/3/26 16:48
 * @description：力扣999
 * @modified By：
 * @version: v1$
 */
public class Solution {

    int res = 0;

    public int numRookCaptures(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'R') {
                    
                    return res;
                }
            }
        }
        return 0;
    }

    private void help(char c, int i) {
        
    }


}
