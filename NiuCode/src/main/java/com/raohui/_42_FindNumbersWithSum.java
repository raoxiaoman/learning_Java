package com.raohui;

import java.util.ArrayList;

public class _42_FindNumbersWithSum {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> list = new ArrayList<>();
        if(array.length<1){
            return list;
        }
        int start = 0;
        int end = array.length -1;
        int temp = 0;
        while (start <  end  ){
            temp = array[start] + array[end];
            if(temp < sum){
                start++;
            }else if(temp > sum){
                end--;
            }else {
                list.add(array[start]);
                list.add(array[end]);
                break;
            }

        }
        return list;

    }
}
