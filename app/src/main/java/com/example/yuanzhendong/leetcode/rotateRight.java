package com.example.yuanzhendong.leetcode;

public class rotateRight {
    public class ListNode {
      int val;
      ListNode next;
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        } else if (head.next == null) {
            return head;
        } else if (k == 0) {
            return head;
        } else {
            int len = 0;
            ListNode tmp = head;
            ListNode tmp2 = head;
            ListNode tmpHead = head;
            ListNode tail = null;
            while (tmp != null) {
                if (tmp.next == null) {
                    tail = tmp;
                }
                tmp = tmp.next;
                len = len + 1;
            }
            k = k % len;

            int steps = len - k;

            while (steps > 0) {
                steps = steps - 1;
                tmp2 = tmp2.next;
                if (steps == 1) {
                    head = tmp2.next;
                    tmp2.next = null;
                }
            }
            System.out.println("here");
            if (tail != null) {
                tail.next = tmpHead;
            }
            return head;
        }
    }
}
