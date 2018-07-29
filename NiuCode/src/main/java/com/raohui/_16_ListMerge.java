package com.raohui;

public class _16_ListMerge {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode current = null;
        ListNode head = null;
        if(list1==null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        while(list1!=null && list2!=null){
            if(list1.val <= list2.val){
                if(head==null){
                    head  = new ListNode(list1.val);
                    current = head;
                }else{
                    current.next = list1;
                    current = current.next;
                }
                list1 = list1.next;
            }else {
                if(head==null){
                    head  = new ListNode(list2.val);
                    current = head;
                }else{
                    current.next = list2;
                    current = current.next;
                }
                list2 = list2.next;
            }
        }

        if(list1!=null ){
            current.next = list1;

        }
        if(list2!=null){

            current.next = list2;
        }
        return  current;
    }
}
