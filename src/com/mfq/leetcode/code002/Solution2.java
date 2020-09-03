package com.mfq.leetcode.code002;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/8/21 15:08
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        while (l1 != null) {
            list1.add(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            list2.add(l2.val);
            l2 = l2.next;
        }
        int max = Math.max(list1.size(), list2.size());
        int[] nums1 = new int[max];
        int[] nums2 = new int[max];
        for (int i = 0; i < list1.size(); i++) {
            nums1[i] = list1.get(i);
        }
        for (int i = 0; i < list2.size(); i++) {
            nums2[i] = list2.get(i);
        }
        int[] res = new int[max + 1];
        int temp = 0;
        for (int i = 0; i < max; i++) {
            res[i] = (nums1[i] + nums2[i] + temp) % 10;
            temp = (nums1[i] + nums2[i] + temp) / 10;
        }
        res[max] = temp;
        ListNode listNode = new ListNode(-1);
        ListNode ret = listNode;
        for (int i = 0; i < res.length; i++) {
            if (i == res.length - 1 && res[i] == 0) {

            } else {
                listNode.next = new ListNode(res[i]);
                listNode = listNode.next;
            }

        }

        return ret.next;
    }
}
