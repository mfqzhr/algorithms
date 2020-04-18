package com.mfq.leetcode.code203;

import javafx.beans.property.ListPropertyBase;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/15 9:54
 * @description：
 * @modified By：
 * @version: $
 */

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode newHead = new ListNode(0);
        ListNode newTail = newHead;
        while (head != null) {
            if (head.val != val) {
                // newTail.next = head;
                newTail = head;
            }
            head = head.next;
        }
        newTail.next = null;
        return newHead.next;
    }
}
