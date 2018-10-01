package com.raohui;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            System.out.println(scanner.nextInt());
        }
    }
}
