package com.raohui;

public class _11_NumberOf1 {
    public int NumberOf1(int n) {
        int count = 0;
        while(n!=0){
            count++;
            n = n & (n- 1);
        }
        return  count;

    }
}
