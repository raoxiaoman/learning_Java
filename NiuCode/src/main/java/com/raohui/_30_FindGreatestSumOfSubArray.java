package com.raohui;

public class _30_FindGreatestSumOfSubArray {
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array.length == 0) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i:array){
            sum = Math.max(sum+i,i);
            max = Math.max(sum,max);
        }
        return max;

    }

    public static void main(String[] args) {
        int array[] = {1,-2,3,10,-4,7,2,-5};
        int res = new _30_FindGreatestSumOfSubArray().FindGreatestSumOfSubArray(array);
        System.out.println(res);
    }
}
