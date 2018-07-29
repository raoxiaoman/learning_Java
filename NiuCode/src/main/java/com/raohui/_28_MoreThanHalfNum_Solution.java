package com.raohui;

import java.util.HashMap;

public class _28_MoreThanHalfNum_Solution {

    public int MoreThanHalfNum_Solution(int[] array) {
        if(array.length ==0){
            return 0;
        }
        HashMap<Integer, Integer> maps = new HashMap<>();
        for (int key : array) {
            if (!maps.containsKey(key)) {
                maps.put(key, 1);
            } else {
                maps.replace(key, maps.get(key) + 1);
            }
        }
        for (HashMap.Entry<Integer, Integer> entry : maps.entrySet()) {
//            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
            if (entry.getValue() > array.length / 2) {
                return entry.getKey();
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int array[] = {1,2,3,2,2,2,5,4,2};
        int result = new _28_MoreThanHalfNum_Solution().MoreThanHalfNum_Solution(array);
        System.out.println(result);
    }
}
