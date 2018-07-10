package com.raohui;

public class Fibonacci {
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
        Fibonacci f = new Fibonacci();
        System.out.println(f.Fibonacci(3));
    }
}
