package com.mfq.leetcode.code119;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mufanqiang
 */
public class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<List<Integer>> rows = new ArrayList<>();
        List<Integer> columns;
        for (int i = 0; i <= rowIndex; i++) {
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

        return rows.get(rowIndex);


    }
}