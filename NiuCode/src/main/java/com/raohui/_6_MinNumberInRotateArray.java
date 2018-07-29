package com.raohui;

import java.util.Arrays;

public class _6_MinNumberInRotateArray {
    public int minNumberInRotateArray(int [] array) {
        if (array.length == 0){
            return  0;
        }
        int head = 0;
        int tail = array.length-1;
        int mid = (head+tail) /2;
        while(array[head] >=array[tail]){
            if(head == tail -1){
                return array[tail];
            }
            if(array[mid] == array[head] && array[mid] == array[tail]){
                int min = array[head];
                for(int i = head+1 ;i<=tail;i++){
                    min =  array[i] < min?array[i]:min;
                }
                return  min;
            }
            if(array[mid]  >= array[head]){
                head = mid;
            }else{
                tail = mid;
            }

            mid = (head+tail) /2;
        }
        return  array[head];
    }
}
