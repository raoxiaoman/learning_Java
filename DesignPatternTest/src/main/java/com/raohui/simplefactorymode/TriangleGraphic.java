package com.raohui.simplefactorymode;

public class TriangleGraphic implements Graphic {
    @Override
    public void draw() {
        System.out.println("draw triangle!");
    }

    @Override
    public void delete() {
        System.out.println("delete triangle!");
    }
}
