package com.mfq.leetcode.code680;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public boolean validPalindrome(String s) {
        char[] chars = s.toCharArray();
        int lo = 0, hi = chars.length - 1;
        int t1 = 0, t2 = 0;
        while (lo < hi) {
            if (chars[lo] != chars[hi]) {
                t1 = lo;
                t2 = hi;
                break;
            }
            lo++;
            hi--;
        }
        if (lo >= hi)
            return true;
        int lo1 = 0, hi1 = chars.length - 1;
        boolean res1 = true, res2 = true;
        while (lo1 < hi1) {
            if (t2 == hi1)
                hi1--;
            if (chars[lo1] != chars[hi1]) {
                res1 = false;
            }

            lo1++;
            hi1--;
        }
        lo1 = 0;
        hi1 = chars.length - 1;
        while (lo1 < hi1) {
            if (t1 == lo1)
                lo1++;
            if (chars[lo1] != chars[hi1]) {
                res2 = false;
            }

            lo1++;
            hi1--;
        }
        if (res1 == false && res2 == false)
            return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().validPalindrome("cdbeeeabddddbaeedebdc"));
    }

}

/*
public class Solution {

    public boolean validPalindrome(String s) {
        char[] chars = s.toCharArray();
        List<Character> list = new ArrayList<>();
        List<Character> list1 = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            list.add(chars[i]);
            list1.add(chars[i]);
        }
        int lo = 0, hi = chars.length - 1;
        while (lo < hi) {
            if (chars[lo] != chars[hi]) {
                list.remove(lo);
                list1.remove(hi);
                break;
            }
            lo++;
            hi--;
        }
        if (lo >= hi)
            return true;
        int lo1 = 0,hi1 = chars.length - 2;
        while (lo1 < hi1) {
            if (list.get(lo1) != list.get(hi1) && list1.get(lo1) != list1.get(hi1)) {
                return false;
            }
            lo1++;
            hi1--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().validPalindrome("abcdd"));
    }

}*/
