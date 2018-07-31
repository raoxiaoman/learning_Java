package com.raohui;

import java.lang.ref.PhantomReference;

public class _36_FindFirstCommonNode {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        int length1 = getListLength(pHead1);
        int length2 = getListLength(pHead1);
        int lengthDif = length1 -length2;
        if(lengthDif>0){
            while (lengthDif>0){
                pHead1 = pHead1.next;
                lengthDif--;
            }
        }else if(lengthDif < 0){
            while (lengthDif<0){
                pHead2 = pHead2.next;
                lengthDif++;
            }
        }
        ListNode res = null;
        while(pHead1!=null && pHead2!=null && pHead1!=pHead2){
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        }
        return pHead1;

    }

    private int getListLength(ListNode pHead) {
        int length = 0;
        ListNode temp = pHead;
        while (temp!=null){
            length++;
            temp = temp.next;
        }
        return length;
    }
}
