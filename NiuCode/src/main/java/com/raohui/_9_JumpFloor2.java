package com.raohui;

public class _9_JumpFloor2 {
    public int JumpFloorII(int target) {
        /*
        * 简便解法！！
        * */
//        int a = 1;
//        return a << (target -1);
        if(target <= 0){
            return -1;
        }else if (target==1){
            return 1;
        }else if(target==2){
            return 2;
        }else{
            return 2*JumpFloorII(target-1);
        }
    }
}
