package com.mfq.面试题.c0109;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/24 21:14
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution {
    public boolean isFlipedString(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        if (s1.length() == 0 && s2.length() == 0) {
            return true;
        }
        s1 = s1 + s1;
        return s1.contains(s2);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isFlipedString("PvcvpkpHwaXQxpgGzURBvHRMvCsCPPmlKBSzXDWSvrxLBPdAvRpgcIwNOVQDdwPIElrAFqmb"
                , "SvrxLBPdAvRpgcIwNOVQDdwPIElrAFqmbPvcvpkpHwaXQxpgGzURBvHRMvCsCPPmlKBSzXDW"));
    }

}
