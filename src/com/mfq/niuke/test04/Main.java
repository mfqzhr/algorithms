package com.mfq.niuke.test04;

import java.util.*;
public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            char[] chars = scanner.nextLine().toCharArray();
            List<String> list = new ArrayList<>();
            for (int i = 0; i < chars.length; i++) {

                if ((chars[i] >= 'a' && chars[i] <= 'z') || (chars[i] >= 'A' && chars[i] <= 'Z')) {
                    list.add(String.valueOf(chars[i]));
                    Collections.sort(list, new Comparator<String>() {
                        @Override
                        public int compare(String o1, String o2) {
                            return o1.compareToIgnoreCase(o2);
                        }
                    });

                }

            }
            for (int i = 0; i < chars.length; i++) {
                if (!(chars[i] >= 'a' && chars[i] <= 'z') && !(chars[i] >= 'A' && chars[i] <= 'Z')) {
                    list.add(i,String.valueOf(chars[i]));

                }
            }
            for (String s :list) {
                System.out.print(s);
            }
            System.out.println();

        }
    }
}
