package com.raohui;

import java.util.LinkedList;
import java.util.Queue;

public class ReOrderArray {
    public void reOrderArray(int [] array) {
        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();
        for (int anArray : array) {
            if (anArray % 2 == 1) {
                queue1.offer(anArray);
            } else {
                queue2.offer(anArray);
            }
        }
        int j = 0;
        while (!queue1.isEmpty()){
            array[j] = queue1.poll();
            j++;
        }
        while (!queue2.isEmpty()){
            array[j] = queue2.poll();
            j++;
        }
    }
}
