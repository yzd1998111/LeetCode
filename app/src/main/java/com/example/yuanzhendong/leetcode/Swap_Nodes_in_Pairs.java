package com.example.yuanzhendong.leetcode;

public class Swap_Nodes_in_Pairs {
    public class ListNode {
        int val;
       ListNode next;
       ListNode(int x) { val = x; }
    }

    public ListNode swapPairs(ListNode head) {
        int swapped = 0;
        ListNode prevNode = null;
        ListNode prevPrevNode = null;
        ListNode curNode = head;
        int start = 0;
        if (head == null) {
            return null;
        } else if (head.next == null) {
            return head;
        } else {
            while (curNode != null) {
                if (swapped == 0) {
                    if (prevPrevNode != null && curNode.next != null) {
                        prevPrevNode.next = curNode.next;
                    }
                    swapped = 1;
                    prevNode = curNode;
                    prevPrevNode = curNode;
                    curNode = curNode.next;
                } else if (swapped == 1) {
                    swapped = 0;
                    if (prevNode != null) {
                        prevNode.next = curNode.next;
                    }
                    if (start == 0) {
                        start = 1;
                        head = curNode;
                    }
                    curNode.next = prevNode;
                    curNode = prevNode.next;
                }

            }
        }
        return head;
    }
}
