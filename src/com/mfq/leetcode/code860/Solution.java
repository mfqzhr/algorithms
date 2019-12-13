package com.mfq.leetcode.code860;


import java.util.*;

/**
 * @author 穆繁强
 * @date 2019/12/13
 */
public class Solution {
    public boolean lemonadeChange(int[] bills) {
        Map<Integer, Integer> map = new HashMap<>();
        int five = 0, ten = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                five++;
            }
            if (bills[i] == 10) {
                if (five <= 0) {
                    return false;
                }
                ten++;
                five--;
            }
            if (bills[i] == 20) {
                if (ten <= 0) {
                    if (five < 3) {
                        return false;
                    }
                    five = five - 3;

                } else {
                    if (five < 1) {
                        return false;
                    }
                    ten--;
                    five--;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5, 5, 5, 5, 20, 20, 5, 5, 5, 5};
        System.out.println(new Solution().lemonadeChange(nums));
    }
}
