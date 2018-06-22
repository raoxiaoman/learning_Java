package com.raohui;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Hello world!
 *
 */
class Fruit{
    public void haha(){
        System.out.println(this.getClass().getName());
    }
}
class Apple extends Fruit{

}
class Plate<T>{
    T some;
    public Plate(T s){
        this.some = s;
    }

    
    /**
     * Get some.
     *
     * @return some as T.
     */
    public T getSome()
    {
        return some;
    }
    
    /**
     * Set some.
     *
     * @param some the value to set.
     */
    public void setSome(T some)
    {
        this.some = some;
    }
}
class genericTest<T>{
    public T mylist;
    public genericTest(T list){
        mylist =  list;
    }
    
    public void test(){
        System.out.println(mylist);
    }
}
public class App 
{
    enum EnumTest{
        Test1("raohui"),
        Test2(100),
        Test3("gaoxiao");

        private EnumTest(){

        }
        private EnumTest(int i){
            this.i = i;
        }
        private EnumTest(String str){
            this.str = str;
        }

        private int i = 1;
        private String str = "test";
        /**
         * Get i.
         *
         * @return i as int.
         */
        public int getI()
        {
            return i;
        }

        /**
         * Set i.
         *
         * @param i the value to set.
         */
        public void setI(int i)
        {
            this.i = i;
        }

        /**
         * Get str.
         *
         * @return str as String.
         */
        public String getStr()
        {
            return str;
        }

        /**
         * Set str.
         *
         * @param str the value to set.
         */
        public void setStr(String str)
        {
            this.str = str;
        }


    }

    public static void main( String[] args )
    {

        //for (int i = 0; i < EnumTest.values().length; i++) {
            //System.out.println(EnumTest.values()[i]+":"+EnumTest.values()[i].getStr()+","+EnumTest.values()[i].getI());
        //}
        System.out.println( "Hello World!" );
        List<String> list1 = new ArrayList<String>();
        list1.add("raohui");
        list1.add("jiayou");
        List<String> list2 = new LinkedList<String>();
        list2.add("raohuia");
        list2.add("raohui11");
        genericTest<ArrayList<String>> g1 = new genericTest(list1);
        g1.test();
        new genericTest(list2).test();
        Apple apple = new Apple();
        Plate<? extends Fruit> plate = new Plate<Apple>(apple);
        plate.getSome().haha();

    }

}
