package com.raohui;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxyTest {
    public static void main(String[] args) {
        SellInvocationHandler handler = new SellInvocationHandler(new Seller());
        Sell seller = (Sell) Proxy.newProxyInstance(Sell.class.getClassLoader(), new Class[]{Sell.class}, handler);
        seller.add();
        seller.sell();
    }

}

class SellInvocationHandler implements InvocationHandler {
    private Object Seller;

    SellInvocationHandler(Object seller) {
        Seller = seller;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("使用动态代理！");
        method.invoke(Seller,args);
        return null;
    }
}

interface Sell {
    void add();

    void sell();
}

class Seller implements Sell {

    @Override
    public void add() {
        System.out.println("add!");
    }

    @Override
    public void sell() {
        System.out.println("sell!");

    }
}
