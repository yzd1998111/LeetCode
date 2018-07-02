package com.example.yuanzhendong.leetcode;


/**
 * edge cases and overflow problem test. If two numbers are added directly, overflow will occur.
 */

public class Add_Two_Numbers {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int firstVal;
        int secondVal;
        int sum = 0;
        int carry = 0;
        int digit;
        ListNode prevNode = null;
        ListNode start = null;
        ListNode curNode = null;
       while (l1 != null || l2 != null) {
           if (l1 != null) {
               firstVal = l1.val;
               l1 = l1.next;
           } else {
               firstVal = 0;
           }

           if (l2 != null) {
               secondVal = l2.val;
               l2 = l2.next;
           } else {
               secondVal = 0;
           }

           sum = firstVal + secondVal + carry;
           digit = sum % 10;
           System.out.println("digit" + digit);
           if (sum >= 10) {
               carry = 1;
           } else {
               carry = 0;
           }
           if (prevNode == null) {
               start = new ListNode(digit);
               prevNode = start;
           } else {
               System.out.println("digit2" + digit);
               curNode =  new ListNode(digit);
               prevNode.next = curNode;
               prevNode = curNode;
           }
       }
       if (carry == 1) {
           prevNode.next = new ListNode(1);
       }
       return start;
    }


}
