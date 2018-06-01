package com.raohui;

/**
 * Hello world!
 *
 */
class A{

}
class Quadrangle{
    public static void draw(Quadrangle q){
        q.print_info();
    }
    public void print_info(){
        System.out.println("Quadrangle");
    }
}
class Square extends Quadrangle{
    public void print_info(){
        System.out.println("Squae");
    }
}
class Parallelogram extends Quadrangle{
    public void print_info(){
        System.out.println("Parallelogram");
    }

}
public class App 
{
    public String toString(){
        return getClass().getName()+"重写方法ToString方法";
    }
    public void test_equals(){
        String s1 = "abc";
        String s2 = "ABC";
        System.out.println(s1.equals(s2));
        System.out.println(s1.toUpperCase().equals(s2));
        System.out.println(new A().equals(new A()));

    }
    public static void main( String[] args )
    {
        System.out.println(new App());
        new App().test_equals();

        //测试向下转型
        Quadrangle q = new Parallelogram();
        if(q instanceof Parallelogram){
            System.out.println(q.getClass().getName());
            Parallelogram p = (Parallelogram) q;
            System.out.println(p.getClass().getName());
            Parallelogram.draw(p);
        }
        //测试向上转型
        System.out.println("------------------------------");
        Quadrangle q1 = new Parallelogram();
        Quadrangle q2 = new Square();
        q1.print_info();
        q2.print_info();
        
    }

}
