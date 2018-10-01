package com.raohui.simplefactorymode;

public class RoundGraphic implements Graphic {
    @Override
    public void draw() {
        System.out.println("画圆形！");
    }

    @Override
    public void delete() {
        System.out.println("删掉圆形!");

    }
}
