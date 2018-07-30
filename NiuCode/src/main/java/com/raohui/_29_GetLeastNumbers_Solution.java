package com.raohui;

import java.util.ArrayList;
import java.util.TreeSet;

public class _29_GetLeastNumbers_Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if(input.length == 0 || k > input.length || k <= 0){
            return arrayList;
        }
        TreeSet<Integer> treeSet = new TreeSet<>();
        int i = 0;
        for(int j:input){
            if(i<k){
                treeSet.add(j);
                i++;
            }else{
                if(j < treeSet.last()){
                    treeSet.pollLast();
                    treeSet.add(j);
                }
            }
        }
        arrayList.addAll(treeSet);
        return arrayList;
    }
}
