package com.raohui;

/**
 * Hello world!
 *
 */

class MyException extends Exception{
    final static long serialVersionUID = 0;
    public MyException(String ErrorMessage){
        super(ErrorMessage);
    }
}

public class App 
{
    static int avg(int a,int b) throws MyException{
        if(a< 0 || b < 0){
            throw new MyException("不可以使用负数");
        }else if(a > 100 || b > 100){
            throw new MyException("数值太大了");
        }else{
            return a+b;
        }
    }
    public static void main( String[] args )
    {
        try {
            avg(-1,-2);
        } catch(MyException e){
            System.out.println(e);
        }
    }
}
