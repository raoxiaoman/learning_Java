package com.raohui;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Hello world!
 *
 */
class RelectTest{
    public RelectTest(){
        this.i = 0;
        this.str = "haha";
    }
    public RelectTest(int i,String str){
        this.i = i;
        this.str = str;
    }
    public String getstr() {
        return str;
    }
    public void setstr(String str) {
        this.str = str;
    }
    public int geti() {
        return i;
    }
    public void seti(int i) {
        this.i = i;
    }
    public String toString(){
        return str+":"+i;
    }

    public static void tohaha(){
        System.out.println("hahaha!");
    }

    private int i;
    private String str;
}

public class App 
{
    public static  void testConstructor(){
        RelectTest relectTest = new RelectTest(10,"haha");
        Class <? extends RelectTest> classz = relectTest.getClass();
        Constructor <?>[] constructors = classz.getConstructors();
        for (int i = 0; i < constructors.length; i++) {
            Constructor<?> constructor = constructors[i];
            if(!constructor.isAccessible()){
                System.out.println("需要设置允许访问");
                constructor.setAccessible(true);
            }
            System.out.println("是否允许带可变参数:"+constructor.isVarArgs());
            System.out.println("参数为:");
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            for (int j = 0; j < parameterTypes.length; j++) {
                System.out.println(parameterTypes[j]);
            }
            System.out.println("可能有的异常类型:");
        
            Class<?>[] exceptionTypes = constructor.getExceptionTypes();
            for (int k = 0; k < exceptionTypes.length; k++) {
                System.out.println(exceptionTypes[i]);
            }
            RelectTest relectTest2 = null;
            try {
                if(constructor.getParameterCount()  == 0){
                    relectTest2 =(RelectTest) constructor.newInstance();
                    System.out.println(relectTest2 instanceof RelectTest);
                }else if(constructor.getParameterCount() == 2){
                    relectTest2 = (RelectTest)constructor.newInstance(100,"raohui");
                }
            } catch(Exception e){
                e.printStackTrace();
            }
            if(relectTest2!=null){
                System.out.println(relectTest2);
            }

        }
    }
    public static void testField(){
        RelectTest relectTest = new RelectTest(10,"haha");
        Class <? extends RelectTest> classz = relectTest.getClass();
        Field[] fields  = classz.getDeclaredFields();

        for (Field field : fields) {
            Class<?> fieldType = field.getType();
            System.out.println("类型:"+fieldType);
            boolean isTurn = true;
            while(isTurn){
                try {
                    isTurn = false;
                    System.out.println("修改前的值:"+field.get(relectTest));
                    if(fieldType.equals(int.class)){
                        field.setInt(relectTest,1000);
                    }else if (fieldType.equals(String.class)){
                        field.set(relectTest,"raohuijiayoubukui");
                    }
                    System.out.println("修改后的值:"+field.get(relectTest));

                } catch(Exception e){
                    System.out.println("运行出现异常,需要设置允许访问!");
                    field.setAccessible(true);
                    isTurn = true;
                }
            }
        }
    }

    public static void testMethod(){
        RelectTest relectTest = new RelectTest(100,"raohui");
        Class <?> classz = relectTest.getClass();
        Method [] methods = classz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("方法名称:"+method.getName());
            System.out.println("是否允许带可变参数:"+method.isVarArgs());
            System.out.println("参数为:");
            Class <?>[] parameterTypes = method.getParameterTypes(); 
            for (Class<?> parameterType : parameterTypes) {
                System.out.println("类型:"+parameterType);
            }
            System.out.println("返回值类型:"+method.getReturnType());
            Class <?>[] exceptionTypes = method.getExceptionTypes();
            for (Class <?> exceptionType : exceptionTypes) {
                System.out.println("异常:"+exceptionType);
                
            }
            boolean isTurn = true;
            while(isTurn){
                try {
                    isTurn = false;
                    if("tohaha".equals(method.getName())){
                        method.invoke(relectTest);
                    }else if("toString".equals(method.getName())){
                        method.invoke(relectTest);
                    }else if("geti".equals(method.getName())){
                        System.out.println(method.invoke(relectTest));
                    }
                    
                } catch(Exception e){
                    System.out.println("运行出现异常,需要设置允许访问!");
                    method.setAccessible(true);
                    isTurn = true;
                }
            }
        }

    }


    public static void main( String[] args )
    {
        //testConstructor();
        //testField();
        testMethod();

        

    }    
}
