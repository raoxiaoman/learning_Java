package com.raohui;
/**
 * Created by raohui on 18-5-14.
 */
public class Test{
    int a;
    double b;
    char  c;

    public void justswitch(int a){
        switch (a){
            case 1:
                System.out.println("哈哈哈");
            case 2:
                System.out.println("哈!");
            case 3:
                System.out.println("哈哈哈ha");
        }
    }
    public Test(int a, double b, char c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "test{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
