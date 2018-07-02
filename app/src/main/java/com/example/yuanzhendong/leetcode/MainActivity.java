package com.example.yuanzhendong.leetcode;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.yuanzhendong.leetcode.Add_Two_Numbers;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        Add_Two_Numbers.ListNode list2 = new Add_Two_Numbers.ListNode(1);
        list2.next = new Add_Two_Numbers.ListNode(9);
        list2.next.next = new Add_Two_Numbers.ListNode(9);
        list2.next.next.next = new Add_Two_Numbers.ListNode(9);
        list2.next.next.next.next = new Add_Two_Numbers.ListNode(9);
        list2.next.next.next.next.next = new Add_Two_Numbers.ListNode(9);
        list2.next.next.next.next.next.next= new Add_Two_Numbers.ListNode(9);
        list2.next.next.next.next.next.next.next= new Add_Two_Numbers.ListNode(9);
        list2.next.next.next.next.next.next.next.next= new Add_Two_Numbers.ListNode(9);
        list2.next.next.next.next.next.next.next.next.next = new Add_Two_Numbers.ListNode(9);
        Add_Two_Numbers.ListNode res = Add_Two_Numbers.addTwoNumbers(new Add_Two_Numbers.ListNode(9), list2);
        super.onCreate(savedInstanceState);
    }
}
