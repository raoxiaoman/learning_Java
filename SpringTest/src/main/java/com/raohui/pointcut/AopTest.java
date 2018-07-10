package com.raohui.pointcut;

public class AopTest {
    private  String name;
    private  int  age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void printThrowsException(){
        System.out.println("exception");
        throw new IllegalArgumentException();
    }
}
