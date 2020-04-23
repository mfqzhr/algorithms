package com.mfq.leetcode.code234;

import sun.awt.AWTAccessor;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/23 1:53
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
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }
        if (head.next == null) {
            return true;
        }
        if (head.next.next == null) {
            return head.val == head.next.val;
        }
        // 找到中间节点
        ListNode mid = middleNode(head);
        // 反转链表
        ListNode next = reverse(mid.next);
        while (next != null) {
            if (head.val != next.val) {
                return false;
            }
            head = head.next;
            next = next.next;
        }
        return true;
    }

    private ListNode reverse(ListNode next) {
        ListNode cur = next;
        ListNode pre = null;
        ListNode temp = null;
        while (cur != null) {
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }

    private ListNode middleNode(ListNode head) {
        ListNode p1 = head;
        ListNode p2 = head;
        while (p1.next != null && p1.next.next != null) {
            p2 = p2.next;
            p1 = p1.next.next;
        }
        return p2;
    }
}
