package com.raohui.simplefactorymode;

public class TriangleGraphic implements Graphic {
    @Override
    public void draw() {
        System.out.println("画三角形！");
    }

    @Override
    public void delete() {
        System.out.println("删除三角形！");
    }
}
