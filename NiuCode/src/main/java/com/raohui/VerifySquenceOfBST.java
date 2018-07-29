package com.raohui;

public class VerifySquenceOfBST {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length == 0){
            return  false;
        }
        if(sequence.length == 1 ){
            return  true;
        }
        return verify(sequence,0,sequence.length-1);

    }

    private boolean verify(int[] sequence, int start, int end) {
        if(start >= end){
            return true;
        }
        int i  = end-1;
        while(i>start && sequence[i] >sequence[end] ){
            i--;
        }
        for(int j = i-1;j>=start;j--){
            if(sequence[j] > sequence[end]){
                return false;
            }
        }
        return verify(sequence,start,i-1) && verify(sequence,i,end - 1);
    }
}
