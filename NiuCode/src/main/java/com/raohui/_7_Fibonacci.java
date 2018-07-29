package com.raohui;

public class _7_Fibonacci {
    public int Fibonacci(int n){
        int a = 1,b =0,c = 1;
        if(n==0){
           return 0;
        }
        for(int i = 0;i<n;i++){
            c = a + b;
            a = b;
            b = c;
        }
        return  c;

    }

    public static void main(String[] args) {
        _7_Fibonacci f = new _7_Fibonacci();
        System.out.println(f.Fibonacci(3));
    }
}
