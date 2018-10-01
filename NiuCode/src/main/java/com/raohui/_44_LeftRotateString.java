package com.raohui;

public class _44_LeftRotateString {
    public String LeftRotateString(String str,int n) {
        if(str.length() == 0 || n ==0  || str.length() < n){
            return str;
        }
        StringBuilder part1 = new StringBuilder(str.substring(0,n));
        StringBuilder part2 = new StringBuilder(str.substring(n));
        part1 = part1.reverse();
        part2 = part2.reverse();
        StringBuilder res = part1.append(part2);
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        String res = new _44_LeftRotateString().LeftRotateString("raohui",3);
        System.out.println(res);
    }
}
