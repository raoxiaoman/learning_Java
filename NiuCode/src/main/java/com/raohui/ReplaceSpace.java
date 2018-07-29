package com.raohui;

public class ReplaceSpace {
    private String replaceSpace(StringBuffer str) {
        int count = 0;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i)== ' '){
                count++;
            }
        }
        int oldend = str.length()-1;
        str.setLength(str.length()+2*count);
        for(int i=oldend;i>=0;i--)
            if (str.charAt(i) != ' ') {
                str.setCharAt(i + (2 * count),str.charAt(i));
            } else {
                str.setCharAt(i + (2 * count),'0');
                str.setCharAt(i + (2 * count)-1,'2');
                str.setCharAt(i + (2 * count)-2,'%');
                count--;
            }
        return str.toString();

    }

    public static void main(String[] args) {

       String str =  new ReplaceSpace().replaceSpace(new StringBuffer("hello world"));
        System.out.println(str);

    }
}
