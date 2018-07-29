package com.raohui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class _2019_AliTest1 {
    private static ArrayList<String> path = new ArrayList<String>();
    private static ArrayList<Integer> dat = new ArrayList<Integer>();

    private static void swap(String[] str, int i, int j) {
        String temp;
        temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }

    /*
     * 回溯法,求遍历地点,所有不同的路径
     */
    private static void arrange(String[] str, int st, int len) {
        if (st == len - 1) {
            StringBuilder val = new StringBuilder();
            for (int i = 0; i < len; i++) {
                val.append(str[i]);
                if (i == len - 1) {
                    continue;
                }
                val.append("-");
            }
            path.add(val.toString());
        } else {
            for (int i = st; i < len; i++) {
                swap(str, st, i);
                arrange(str, st + 1, len);
                swap(str, st, i);
            }
        }
    }

    /*
        返回的是两个点之间的距离
     */
    private static int calTwoPoint(String x, String y) {
        String[] _x = x.split(",");
        String[] _y = y.split(",");
        return Math.abs(Integer.valueOf(_x[0]) - Integer.valueOf(_y[0])) + Math.abs(Integer.valueOf(_x[1]) - Integer.valueOf(_y[1]));
    }

    private static void calculate(ArrayList<String> _path, HashMap<String, String> _hashmap) {
        for (String _buf : _path) { //计算每条路径的总距离
            //计算距离
            int sum = 0;
            String[] _ar = _buf.split("-");
            for (int j = 0; j < _ar.length - 1; j++) {
                sum = sum + calTwoPoint(_hashmap.get(_ar[j]), _hashmap.get(_ar[j + 1]));
            }
            sum = sum + calTwoPoint("0,0", _hashmap.get(_ar[0]));
            sum = sum + calTwoPoint("0,0", _hashmap.get(_ar[_ar.length - 1]));
            dat.add(sum);
        }
        //输出最小
        System.out.println(Collections.min(dat));
    }

    public static void main(String[] args) {

        HashMap<String, String> address = new HashMap<>();
        Scanner input = new Scanner(System.in);
        int number = Integer.valueOf(input.nextLine());
        for (int i = 0; i < number; i++) {
            String v = input.nextLine();
            address.put(String.valueOf(i + 1), v);
        }
        String[] str = new String[number];
        for (int i = 0; i < number; i++) {
            str[i] = String.valueOf(i + 1);
        }
        arrange(str, 0, str.length);
        calculate(path, address);
    }
}
