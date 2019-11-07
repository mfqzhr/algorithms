package com.mfq.leetcode.code167;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;



/**
 * 解题思路1: 双指针算法: 定义lo和hi两个变量
 * 如果 numbers[lo] + numbers[hi] == target 返回这两个下标
 * 如果 numbers[lo] + numbers[hi] > target 让hi--
 * 如果 numbers[lo] + numbers[hi] < target 让lo++
 */

/**
 * 解题思路2: 依次遍历这个数组,
 * 用目标值减去当前这个数看看map中是否包含这个数, 如果包含就返回这个数的下标 和 包含数的下标
 */
public class Solution {

/*    public int[] twoSum(int[] numbers, int target) {
        int lo = 0, hi = numbers.length - 1;
        while (lo < hi) {
            if (numbers[lo] + numbers[hi] == target) {
                return new int[]{lo + 1, hi + 1};
            } else if (numbers[lo] + numbers[hi] < target) {
                lo++;
            } else if (numbers[lo] + numbers[hi] > target){
                hi--;
            }
        }
        return null;

    }*/

    public int[] twoSum(int[] numbers, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], i);
        }

        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                return new int[]{i + 1, map.get(target - numbers[i]) + 1};
            }
        }

        return null;
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        System.out.println(Arrays.toString(new Solution().twoSum(arr, 9)));
    }


}
