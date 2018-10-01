package com.raohui;

import java.util.ArrayList;
import java.util.List;

public class _46_LastRemaining_Solution {
    public int LastRemaining_Solution(int n, int m) {
        if (n < 1 || m < 1) {
            return -1;
        }
        int array[] = new int[n];
        int step = 0;
        int i = -1;
        int count = n;
        while (count > 0) {
            i++;
            if (i >= n) {
                i = 0;
            }
            if (array[i] == -1) {
                continue;
            }
            step++;
            if (step == m) {
                array[i] = -1;
                count--;
                step = 0;
            }
        }
        return i;


    }

    public static void main(String[] args) {
        int res = new _46_LastRemaining_Solution().LastRemaining_Solution(5,3);
        System.out.println(res);
    }
}
