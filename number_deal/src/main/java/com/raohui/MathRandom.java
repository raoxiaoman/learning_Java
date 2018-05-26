package com.raohui;

public class MathRandom {

    public static int GetEvenNum(double num1,double num2) {
        double rand = num1 + (Math.random()*(num2-num1));
        int s = (int)rand;
        if(s%2==0){
            return s;
        }else{
            return s+1;
        }

    }
    public static char GetRandomChar(char char1,char char2) {
        double rand = char1 + (Math.random()*(char2-char1+1));
        char c = (char)rand;
        return c;

    }

    public static void main(String[] args) {
        System.out.println(GetEvenNum(2,32));
        System.out.println(GetRandomChar('a','o'));
    }
}

