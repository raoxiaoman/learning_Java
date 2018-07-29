package com.raohui;

public class _1_FindNumber {
    public boolean Find(int target, int [][] array) {
        for(int[] ar:array){
            if(find(target,ar)){
                return true;
            }

        }
        return false;
    }

    private boolean find(int target, int[] ar) {
        int first = 0;
        int end = ar.length - 1;
        while (first<=end){
            int mid = (first+end) /2;
            if(target > ar[mid]){
                first = mid+1;
            }else if(target < ar[mid]){
                end = mid -1;
            }else {
                return true;
            }
        }
        return false;
    }
}
