package com.raohui;
import java.util.Arrays;

/**
 * Created by raohui on 18-5-14.
 */
public class TestArray {
    public  void test(){
        int iarrays[] = new int[5];
        for (int i = 0; i < 5; i++) {
            iarrays[i] = i*2;
        }
        Arrays.sort(iarrays);
        int index = Arrays.binarySearch(iarrays,4);
        System.out.println("index:"+index);
        int newarray[] = Arrays.copyOfRange(iarrays,1,2);
        for (int i :newarray) {
            System.out.println(i);
        }
        Arrays.fill(iarrays,20);
        for (int i:iarrays) {
            System.out.println(i);
        }


        double darrays[][] = new double[2][5];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                darrays[i][j] = (i+1) * (j+1);
            }
        }

        for (int i = 0; i < darrays.length; i++) {
            for (int j = 0; j < darrays[i].length; j++) {
                System.out.println(darrays[i][j]);
            }
        }
    }
}
