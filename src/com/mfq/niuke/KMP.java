package com.mfq.niuke;

/**
 * @author 穆繁强
 * @date 2019/10/14
 */
public class KMP {
    public static int getIndexOf(String s, String m) {
        if (s == null || m == null || m.length() < 1 || s.length() < 1) {
            return -1;
        }
        char[] s1 = s.toCharArray();
        char[] s2 = m.toCharArray();
        int i1 = 0;
        int i2 = 0;
        int[] next = getNextArray(s2);
        while (i1 < s1.length && i2 < s2.length) {
            if (s1[i1] == s2[i2]) {
                i1++;
                i2++;
            } else if (next[i2] == -1) {
                i1++;
            } else {
                i2 = next[i2];
            }
            
        }
        return i2 == s2.length ? i1 - i2 : -1;

    }

    private static int[] getNextArray(char[] s) {
        if (s.length == 1) {
            return new int[]{-1};
        }
        int[] next = new int[s.length];
        next[0] = -1;
        next[1] = 0;
        int i = 2;
        int cn = 0;
        while (i < next.length) {
            if (s[i - 1] == s[cn]) {
                next[i++] = ++cn;
            } else if (cn > 0) {
                cn = next[cn];
            } else {
                next[i++] = 0;
            }
        }

        return next;

    }
}
