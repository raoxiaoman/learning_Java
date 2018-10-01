package com.raohui;

import java.util.Arrays;

public class _43_ReverseSentence {
    public String ReverseSentence(String str) {
        if(str.length() == 0){
            return "";
        }else if(str.trim().equals("")){
            return str;

        }
        String st = new StringBuilder(str).reverse().toString();
        String[] strs = st.split(" ");
        StringBuilder res = new StringBuilder();
        for(String s:strs){
            System.out.println(s);
            String temps = new StringBuffer(s).reverse().toString();
            System.out.println(temps);
            res.append(temps);
            res.append(" ");
        }
        res.deleteCharAt(res.length()-1);
        return res.toString();
    }


}
