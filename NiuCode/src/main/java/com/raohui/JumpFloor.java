package com.raohui;

public class JumpFloor {
    public int JumpFloor(int target) {
        if(target <= 0){
            return  -1;
        }
        else if (target ==1){
            return 1;
        }
        else if(target == 2){
            return  2;
        }else{
            int t1 = 0,t2 = 1,result = 0;
            for (int i = 0; i < target; i++) {
                result = t1 + t2;
                t1 = t2;
                t2 = result;
            }
            return  result;

        }

    }

}
