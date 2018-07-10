package com.raohui;

public class NumberOf1 {
    public int NumberOf1(int n) {
        int count = 0;
        while(n!=0){
            count++;
            n = n & (n- 1);
        }
        return  count;

    }
}
