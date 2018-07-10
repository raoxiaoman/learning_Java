package com.raohui;

import java.net.InetAddress;

/**
 * Hello world!
 *
 */
class TestInetAddress{
    public void test(){
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            System.out.println(inetAddress.getHostName());
            System.out.println(inetAddress.getHostAddress());
        } catch(Exception e){
            e.printStackTrace();
        }

    }

}


public class App
{
    public static void main( String[] args )
    {
        new TestInetAddress().test();
    }
}
