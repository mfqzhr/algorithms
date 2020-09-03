package com.mfq.leetcode.code002;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/20 14:36
 * @description：
 * @modified By：
 * @version: $
 */
class ListNode {
    public int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}

public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(-1);
        ListNode res = temp;
        int temp0 = 0;
        while (l1 != null && l2 != null) {
            int val = l1.val + l2.val + temp0;
            temp0 = val / 10;
            temp.next = new ListNode(val % 10);
            l1 = l1.next;
            l2 = l2.next;
            temp = temp.next;
        }
        while (l1 != null) {
            int val = l1.val + temp0;
            temp0 = val / 10;
            temp.next = new ListNode(val % 10);
            l1 = l1.next;
            temp = temp.next;
        }
        while (l2 != null) {
            int val = l2.val + temp0;
            temp0 = val / 10;
            temp.next = new ListNode(val % 10);
            l2 = l2.next;
            temp = temp.next;
        }
        if (temp0 != 0) {
            temp.next = new ListNode(temp0);
            temp = temp.next;
        }
        return res.next;
    }

}
