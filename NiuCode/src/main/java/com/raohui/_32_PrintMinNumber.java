package com.raohui;

import java.util.ArrayList;

public class _32_PrintMinNumber {
    public String PrintMinNumber(int [] numbers) {
        if(numbers.length == 0){
            return "";
        }
        ArrayList<String>  list  = new ArrayList<>();
        for(int i:numbers){
            list.add(String.valueOf(i));
        }
        list.sort((o1, o2) -> {
            String s1 = o1 + o2;
            String s2 = o2 + o1;
            return s1.compareTo(s2);
        });
        StringBuilder res = new StringBuilder();
        for(String s:list){
            res.append(s);
        }
        return res.toString();
    }
}
