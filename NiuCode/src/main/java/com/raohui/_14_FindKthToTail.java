package com.raohui;

import java.util.Stack;

public class _14_FindKthToTail {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head== null ||  k<=0){
            return null;
        }
        Stack<ListNode> stack = new Stack<>();
        ListNode travel = head;
        while (travel!=null){
            stack.push(travel);
            travel = travel.next;
        }
        while(k>1){
            stack.pop();
            k--;
        }
        if(stack.isEmpty()){
           return null;
        }else {
            return stack.pop();
        }
    }
}
