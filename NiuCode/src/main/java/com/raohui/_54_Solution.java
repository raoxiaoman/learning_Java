package com.raohui;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class _54_Solution {
    StringBuilder sb = new StringBuilder();
    Map<Character,Integer> maps = new LinkedHashMap<>();
    //Insert one char from stringstream
    public void Insert(char ch)
    {
        sb.append(ch);
        if(maps.containsKey(ch)){
            maps.put(ch,maps.get(ch)+1);
        }else{
            maps.put(ch,1);
        }
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        for(int i = 0;i<sb.length();i++){
            if(maps.get(sb.charAt(i))==1){
                return sb.charAt(i);
            }
        }
        return '#';

    }
}
