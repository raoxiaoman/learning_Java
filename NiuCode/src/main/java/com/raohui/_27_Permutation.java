package com.raohui;

import java.util.ArrayList;
import java.util.Collections;

public class _27_Permutation {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> res = new ArrayList<>();
        //完整性判断
        if (str != null && str.length() > 0) {
            //字符串转为字符数组进行处理
            Permutation_(str.toCharArray(), 0, res);
            //排序
            Collections.sort(res);
        }
        return res;
    }

    private void Permutation_(char[] toCharArray, int i, ArrayList<String> res) {
        if (i == toCharArray.length - 1) {
            String temp = String.valueOf(toCharArray);
            if (!res.contains(temp)) {
                res.add(temp);
            }
        } else {
            for (int j = i; j < toCharArray.length; j++) {
                swap(toCharArray, i, j);
                Permutation_(toCharArray, i + 1, res);
                swap(toCharArray, i, j);
            }
        }

    }

    private void swap(char[] toCharArray, int i, int j) {
        char temp = toCharArray[i];
        toCharArray[i] = toCharArray[j];
        toCharArray[j] = temp;
    }
}
