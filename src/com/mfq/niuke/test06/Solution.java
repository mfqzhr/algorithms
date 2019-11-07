package com.mfq.niuke.test06;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < intervals.length * 2; i++) {
            list.set(i, intervals[i / 2][i % 2]);
        }
        if (newInterval[1] < list.get(0)) {
            list.add(0,newInterval[0]);
            list.add(1, newInterval[1]);
        }

        if (newInterval[0] > list.get(list.size() - 1)) {
            list.add(newInterval[0]);
            list.add(newInterval[1]);
        }


        return intervals;

    }
}