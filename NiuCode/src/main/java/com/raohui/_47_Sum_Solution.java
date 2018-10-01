package com.raohui;

public class _47_Sum_Solution {

    public int Sum_Solution(int n) {
        int res = n;
        boolean b = res > 0 && ((res += Sum_Solution(n - 1)) > 0);
        return res;
    }


}
