package com.mfq.sort;



import java.util.*;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/8/30 11:10
 * @description：
 * @modified By：
 * @version: $
 */
public class Finder {
    static int res = 0;
    public int findKth(int[] a, int n, int K) {
        quickSort(a,0,n - 1, K);

        return res;
    }

    public static void quickSort(int[] arr, int lo, int hi,int K) {
        if(lo >= hi)
            return;
        int i = lo, j = hi, p = arr[lo];
        while(i <= j) {
            while(arr[i] > p) {
                ++i;
            }
            while(arr[j] < p) {
                --j;
            }
            if(i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                ++i;
                --j;

            } else if( i == j) {
                i++;
            }

        }
        if (i + 1 == K)
            res = arr[i];
        System.out.println("i: " + i + " : " + Arrays.toString(arr));
        quickSort(arr, lo, j,K);
        quickSort(arr, i, hi,K);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,3,5,2,2};
        /*
         * 1 3 5 2 2
         * 5 3 1 2 2
         *
         */
        System.out.println(Arrays.toString(arr));
        System.out.println(new Finder().findKth(arr, 5, 4));
    }
}
class ListNode{

    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}

class Solution {
    /**
     *
     * @param head1 ListNode类
     * @param head2 ListNode类
     * @return ListNode类
     */
    public ListNode addInList (ListNode head1, ListNode head2) {
        // write code here
        ListNode h1 = reverseList(head1);
        ListNode h2 = reverseList(head2);
        ListNode res1 = h1;
        ListNode res2 = h2;
        int num = 0;
        while(h1 != null && h2 != null) {
            int temp = h1.val + h2.val + num;
            h1.val = h2.val = ( temp) % 10;
            num = (temp) / 10;
            h1 = h1.next;
            h2 = h2.next;
        }
        int rest = 0;
        while(h1 != null) {
            rest = 1;
            int temp = h1.val + num;
            h1.val = ( temp) % 10;
            num = (temp) / 10;
            h1 = h1.next;
        }

        while(h2 != null) {
            rest = 2;
            int temp = h2.val + num;
            h2.val =( temp) % 10;
            num = (temp) / 10;
            h2 = h2.next;
        }
        if(rest <= 1) {
            if(num == 1) {
                h1 = new ListNode(1);
            }
            return reverseList(res1);
        } else if(rest == 2) {
            if(num == 1) {
                h2 = new ListNode(1);
            }
            return reverseList(res2);
        }

        return null;
    }

    public static ListNode reverseList(ListNode head) {
        if(head == null)
            return null;
        ListNode cur = head;
        ListNode temp = null;
        ListNode pre = null;
        while(cur != null) {
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode4.next = listNode5;
        ListNode listNode = solution.addInList(listNode1, listNode4);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
