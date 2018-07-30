package com.raohui;

import java.util.LinkedHashMap;

public class _34_FirstNotRepeatingChar {
    public int FirstNotRepeatingChar(String str) {
        if( str == null || str.length() == 0){
            return -1;
        }
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        char chars[] = str.toCharArray();
        for(char c:chars){
            if(!map.containsKey(c)){
                map.put(c,1);
            }else {
                map.put(c,map.get(c)+1);
            }
        }
        for (int i = 0; i < chars.length; i++) {
           if(map.get(chars[i]) == 1){
               System.out.println(i);
               return i;
           }
        }
        return -1;
    }

    public static void main(String[] args) {
        int index = new _34_FirstNotRepeatingChar().FirstNotRepeatingChar("google");
        System.out.println(index);
    }

}
