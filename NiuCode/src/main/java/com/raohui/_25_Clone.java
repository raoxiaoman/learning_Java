package com.raohui;

class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}

public class Clone_25 {
    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null) {
            return null;
        }
        RandomListNode pcur = pHead;
        while (pcur!=null){
            RandomListNode node = new RandomListNode(pcur.label);
            node.next = pcur.next;
            pcur.next = node;
            pcur = node.next;
        }
        pcur = pHead;
        while (pcur!=null){
            if(pcur.random!=null){
                pcur.next.random = pcur.random.next;
            }
            pcur = pcur.next.next;
        }
        RandomListNode head = pHead.next;
        RandomListNode cur = head;
        pcur = pHead;
        while (pcur!=null){
            pcur.next = pcur.next.next;
            if(cur.next!=null){
                cur.next = cur.next.next;
            }
            pcur = pcur.next;
            cur = cur.next;
        }
        return head;

    }

}
