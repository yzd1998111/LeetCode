package com.example.yuanzhendong.leetcode;

public class Remove_Nth_Node_From_End_of_List {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curNode = head;
        ListNode resNode = head;
        ListNode prevNode = null;
        int count = 0;
        int remain;
        while (curNode != null) {
            curNode = curNode.next;
            count = count + 1;
        }
        remain = count - n;

        while (remain != 0) {
            prevNode = resNode;
            resNode = resNode.next;
            remain --;
        }
        if (prevNode != null) {
            prevNode.next = resNode.next;
            return head;
        } else {
            head = head.next;
            return head;
        }
    }
}
