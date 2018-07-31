package com.raohui;

public class _40_FindNumsAppearOnce {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if(array.length<2){
            return;
        }
        int temp = 0;
        for(int i :array){
            temp = temp^i;
        }
        int indexFirst = getFirst1(temp);
        for(int i:array){
            if(isBit(i,indexFirst)){
                num1[0]^=i;
            }else {
                num2[0]^=i;
            }
        }

    }

    private boolean isBit(int i, int indexFirst) {
        i = i >> indexFirst;
        return (i & 1) == 1;
    }

    private int getFirst1(int temp) {
        int indexFirst = 0;
        while ((temp & 1) == 0 && indexFirst < 32){
            temp = temp >> 1;
            indexFirst++;
        }
        return indexFirst;
    }
}
