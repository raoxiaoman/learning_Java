package com.raohui;

/**
 *
 * */
public class RectCover {
    public int RectCover(int target) {
        if(target <= 0){
            return  -1;
        }else  if(target == 1){
            return 1;
        }else if(target == 2){
            return 2;
        }else{
            int a = 0,b = 1,result = 1;
            for (int i = 0; i < target; i++) {
                result = a + b;
                a = b;
                b= result;
            }
            return  result;
        }



    }
}
