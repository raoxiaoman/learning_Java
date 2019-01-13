package com.raohui.simplefactorymode;

public class RoundGraphic implements Graphic {
    @Override
    public void draw() {
        System.out.println("draw round!");
    }
    
    @Override
    public void delete() {
        System.out.println("delete round!");

    }
}
