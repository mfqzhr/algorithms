package com.mfq.leetcode.code118;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mufanqiang
 */
public class Solution {
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) {
            return new ArrayList<>();
        }
        List<List<Integer>> rows = new ArrayList<>();
        List<Integer> columns;
        for (int i = 0; i < numRows; i++) {
            columns = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (i < 2 || j == i || j == 0) {
                    columns.add(1);
                } else {
                    columns.add(rows.get(i - 1).get(j - 1) + rows.get(i - 1).get(j));
                }
            }
            rows.add(columns);
        }

        return rows;


    }


}
