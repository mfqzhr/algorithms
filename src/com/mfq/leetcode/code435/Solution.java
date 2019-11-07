package com.mfq.leetcode.code435;

import java.util.*;

public class Solution {


    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0]
                        ;
            }
        });
        int cnt = 1;
        int end = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < end) {
                continue;
            }
            end = intervals[i][1];
            cnt++;
        }
        return intervals.length - cnt;
    }

    public static void main(String[] args) {
        int[][] nums = new int[][]{{1, 100}, {11, 22}, {1, 11}, {2, 12}};
/*        for (int i = 0; i < 3; i++) {
            nums[i][0] = new Random().nextInt(20);
            nums[i][1] = new Random().nextInt(20) + 25;
            System.out.println(nums[i][0] + " " + nums[i][1]);
        }*/
        System.out.println(new Solution().eraseOverlapIntervals(nums));
    }


}
