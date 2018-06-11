package com.raohui;

/**
 * Hello world!
 *
 */
class ThreadSafe2 implements Runnable{
    private int i = 10;
    public boolean notEmpty = true;
    private synchronized  void doit(){
        if(i > 0){
            System.out.println("thread:"+Thread.currentThread().getName()+"i="+--i);
        }else{
            notEmpty = false;
        }
    }
    public void run(){
        while(notEmpty){
            doit();
            try {
                Thread.sleep(100);
            } catch(Exception e){
                e.printStackTrace();
            }
        }
    }

}
class ThreadSafe1 implements Runnable{

    private int i = 10;
    public boolean notEmpty = true;

    public void run(){
        while(notEmpty){
            synchronized(""){
                if(i > 0){
                    System.out.println("thread:"+Thread.currentThread().getName()+"i="+--i);
                }else{
                    notEmpty = false;
                }
            }
            try {
                Thread.sleep(100);
            } catch(Exception e){
                e.printStackTrace();
            }
        }

    }

    /**
     * Get notEmpty.
     *
     * @return notEmpty as boolean.
     */
    public boolean getNotEmpty()
    {
        return notEmpty;
    }

    /**
     * Set notEmpty.
     *
     * @param notEmpty the value to set.
     */
    public void setNotEmpty(boolean notEmpty)
    {
        this.notEmpty = notEmpty;
    }
}
class ThreadTest extends Thread{
    private int i;
    public ThreadTest(int i){
        this.i = i;
    }
    public void run(){
        System.out.println("你好，饶辉！"+i);
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                sleep(1);
            } catch(Exception e){
                e.printStackTrace();
            }
        }
    }

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
}

class RunnableTest implements Runnable{
    private String name;

    public RunnableTest(String n){
        name = n;
    }

    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(name+i);
        }
        System.out.println(name+"finish");
    }

    /**
     * Get name.
     *
     * @return name as String.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Set name.
     *
     * @param name the value to set.
     */
    public void setName(String name)
    {
        this.name = name;
    }
}
class ThreadJoinSleepTest{
    public void test(){
        Thread thread1 = new Thread(new Runnable(){
            public void run(){
                System.out.println("thread1");
                try {
                    Thread.sleep(10);
                } catch(Exception e){
                    e.printStackTrace();
                }
                for (int i = 0; i < 10; i++) {
                    System.out.println("thread1"+i);
                }
            }
        });
        thread1.start();
        Thread thread2 = new Thread(new Runnable(){
            public void run(){
                System.out.println("thread2");
                try {
                    thread1.join();
                } catch(Exception e){
                    e.printStackTrace();
                }
                for (int i = 0; i < 10; i++) {
                    System.out.println("thread2"+i);
                }
            }
        });
        thread2.setPriority(8);
        thread2.start();
    }

}
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //new ThreadTest(1).start();
        //new ThreadTest(2).start();
        //new Thread(new RunnableTest("Runnable1")).start();
        //new Thread(new RunnableTest("Runnable2")).start();
        //new ThreadJoinSleepTest().test();
        System.out.println("ThreadSafe1");
        ThreadSafe1 ts1 = new ThreadSafe1();
        new Thread(ts1,"thread1").start();
        new Thread(ts1,"thread2").start();
        new Thread(ts1,"thread3").start();
        try {
            Thread.sleep(1000);
        } catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("ThreadSafe2");
        ThreadSafe2 ts2 = new ThreadSafe2();
        new Thread(ts2,"thread1").start();
        new Thread(ts2,"thread2").start();
        new Thread(ts2,"thread3").start();


    }
}
