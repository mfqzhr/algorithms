package com.mfq.leetcode.code451;


import java.util.*;

public class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        int maxFrequency = 1;
        for (char c : chars) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
                if (map.get(c) > maxFrequency)
                    maxFrequency = map.get(c);
            } else {
                map.put(c, 1);

            }
        }

        List<Character>[] list = new ArrayList[maxFrequency + 1];
        for (Character character : map.keySet()) {
            int frequency = map.get(character);
            if (list[frequency] == null) {
                list[frequency] = new ArrayList<>();
            }
            list[frequency].add(character);

        }
        StringBuilder builder = new StringBuilder();
        for (int i = maxFrequency; i >= 0; i--) {
            if (list[i] != null) {
                for (Character c : list[i]) {
                    for (int j = 0; j < i; j++) {
                        builder.append(c);
                    }
                }

            }

        }

        return builder.toString();

    }

    public static void main(String[] args) {
        System.out.println(new Solution().frequencySort("eeeeeeeee"));
    }
}
