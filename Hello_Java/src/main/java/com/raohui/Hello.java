package com.raohui;

/**
 * Created by raohui on 18-5-14.
 */
public class Hello {
    public static void main(String[] args) {
        System.out.println("hello World, please me!");
        Test t = new Test(1, 2, 'c');
        System.out.println("t:"+t);
        Test t1 = t;
        t1.setA(11);
        //Date a = new Date();
        //System.out.println(a);
        System.out.println("t:"+t);
        t.justswitch(2);
        System.out.println(t.toString());
        TestString testString = new TestString();
        testString.test();
        TestArray testArray = new TestArray();
        testArray.test();
        Test raohui = new Test(10,20,'c');
        System.out.println("raohui jia you a raohui" + raohui.getA());
    }
}


