package com.raohui;


public class ReverseList {
    public ListNode ReverseList(ListNode head) {
        ListNode pre = null;
        ListNode next;
        if(head == null){
            return null;
        }
        while(head != null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return  pre;

    }
}
