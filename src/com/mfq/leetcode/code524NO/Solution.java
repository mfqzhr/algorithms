package com.mfq.leetcode.code524NO;

import java.util.*;

public class Solution {
    public String findLongestWord(String s, List<String> d) {
        Set<String> set = new HashSet<>();
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String s1 = new String(chars);
        Collections.sort(d, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                return o2.length() - o1.length();
            }
        });
        for (int i = 0; i < d.size(); i++) {
            char[] chars1 = d.get(i).toCharArray();
            Arrays.sort(chars1);
            String s2 = new String(chars1);
            s1.contains(s2);
        }
        return "";
    }
}
