package com.raohui;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}


public class TailToHeadList {
    private ListNode head;

    public ListNode getHead() {
        return head;
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> lists = new ArrayList<>();
        Stack<Integer> stacks = new Stack<>();
        ListNode temp = listNode;
        while (temp != null) {
            stacks.push(temp.val);
            temp = temp.next;
        }
        while (!stacks.empty()) {
            lists.add(stacks.pop());
        }
        return lists;
    }

    public void createList() {
        head = new ListNode(0);
        ListNode travel = head;
        for (int i = 1;i<10;i++){
            ListNode temp = new ListNode(i);
            travel.next  = temp;
            travel = temp;
        }

    }

    public static void main(String[] args) {
        TailToHeadList solution = new TailToHeadList();
        solution.createList();
        List<Integer> result = solution.printListFromTailToHead(solution.getHead());
        System.out.println(result);

    }
}
