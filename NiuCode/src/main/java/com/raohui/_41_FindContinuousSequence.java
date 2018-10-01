package com.raohui;

import java.util.ArrayList;

public class _41_FindContinuousSequence {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        int small = 1;
        int big = 2;
        int temp = small + big;
        while (small < (sum / 2 + 1)) {
            if (temp == sum) {
                addList(lists, small, big);

            }
            while (temp > sum && small < (sum / 2 + 1)) {
                temp -= small;
                small++;
                if (temp == sum) {
                    addList(lists, small, big);

                }
            }
            big++;
            temp += big;


        }
        return lists;

    }

    private void addList(ArrayList<ArrayList<Integer>> lists, int small, int big) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = small; i <= big; i++) {
            list.add(i);
        }
        lists.add(list);
    }
}
