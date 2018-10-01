package com.raohui;

import java.util.ArrayList;
import java.util.List;

public class _55_EntryNodeOfLoop {
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        List<ListNode> list = new ArrayList<>();
        while (pHead!=null && !list.contains(pHead)){
            list.add(pHead);
            pHead=pHead.next;
        }
        return pHead;
    }
}
