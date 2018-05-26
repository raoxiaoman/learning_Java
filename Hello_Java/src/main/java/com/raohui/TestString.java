package com.raohui;
import java.util.Date;

/**
 * Created by raohui on 18-5-14.
 */
public class TestString {
    public void test(){
        String a1 = " zhess ndsjiad e";
        String a2 = a1.substring(3);
        String a3 = a1.replace('s','a');
        String a4 = a1.trim();
        String result[] = a1.trim().split(" ");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        for (String a:result){
            System.out.println(a);
        }
        Date date = new Date();
        System.out.println("year:"+String.format("%tY",date));
        System.out.println("month:"+String.format("%tB",date));
        System.out.println("day:"+String.format("%td",date));

        String regex = "\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}";
        String mail = "717480988@qq.com";
        if (mail.matches(regex)){
            System.out.println(mail);
        }
        String temp ="";
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            temp= temp+i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println(temp);
        System.out.println("costTime:"+(endTime-startTime));

        StringBuffer tempbuffer = new StringBuffer();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            tempbuffer.append(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println(tempbuffer.toString());
        System.out.println("costTime:"+(endTime-startTime));

    }
}
