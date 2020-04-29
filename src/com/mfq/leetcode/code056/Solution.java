package com.mfq.leetcode.code056;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/27 21:12
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        int rows = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i - 1][1] >= intervals[i][1]) {
                intervals[i][0] = intervals[i - 1][0];
                intervals[i][1] = intervals[i - 1][1];
                intervals[i - 1][0] = Integer.MAX_VALUE;
                intervals[i - 1][1] = Integer.MAX_VALUE;
                rows++;
            } else {
                intervals[i][0] = intervals[i - 1][0];
                intervals[i - 1][0] = Integer.MAX_VALUE;
                intervals[i - 1][1] = Integer.MAX_VALUE;
                rows++;
            }
        }
        int[][] res = new int[intervals.length - rows][2];
        int cur = 0;
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][0] == Integer.MAX_VALUE && intervals[i][1] == Integer.MAX_VALUE) {

            } else {
                res[cur][0] = intervals[i][0];
                res[cur][1] = intervals[i][1];
                cur++;
            }
        }
        return res;
    }
}
