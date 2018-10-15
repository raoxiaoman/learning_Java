package com.raohui;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class _64_maxInWindows {

    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> ret = new ArrayList<>();
        if(size  == 0){
            return ret;
        }
        ArrayDeque<Integer> q = new ArrayDeque<>();
        int begin ;
        for(int  i = 0;i<num.length;i++){
            begin = i - size +1;
            if(q.isEmpty()){
                q.add(i);
            }else  if(begin > q.peekFirst()){//判断是否队列头的最大值是否过期
                q.pollFirst();
            }
            while (!q.isEmpty() && num[q.peekLast()] < num[i]){
                q.pollLast();
            }
            q.add(i);
            if(begin >= 0){
                ret.add(num[q.peekFirst()]);
            }
        }
        return ret;

    }
}
