package com.mfq.leetcode.code237;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/20 14:12
 * @description：
 * @modified By：
 * @version: $
 */
class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}

public class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode listNode = new ListNode(-1);
        ListNode res = listNode;
        while (head != null) {
            while (head != null && head.val == val) {
                head = head.next;
            }
            listNode.next = head;
            listNode = listNode.next;
            if (head != null)
                head = head.next;
        }
        return res.next;
    }
}
