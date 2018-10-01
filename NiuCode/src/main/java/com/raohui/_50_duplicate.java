package com.raohui;

public class _50_duplicate {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        boolean res =  false;
        boolean [] pd = new boolean[length];
        for (int i = 0; i < length; i++) {
            if(pd[numbers[i]]){
                res = true;
                duplication[0] = numbers[i];
                break;
            }
            pd[numbers[i]] = true;
        }
        return res;

    }
}
