package com.raohui;

import java.util.ArrayList;

public class _33_GetUglyNumber_Solution {
    public int GetUglyNumber_Solution(int index) {
        if (index <= 0) {
            return 0;
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        int y2 = 0, y3 = 0, y5 = 0;
        while (list.size() < index) {
            int m2 = list.get(y2) * 2;
            int m3 = list.get(y3) * 3;
            int m5 = list.get(y5) * 5;

            int min = Math.min(m2, Math.min(m3, m5));
            list.add(min);
            if (m2 == min) {
                y2++;
            }
            if (m3 == min) {
                y3++;

            }
            if (m5 == min) {
                y5++;
            }
        }
        return list.get(list.size()-1);
    }
}
