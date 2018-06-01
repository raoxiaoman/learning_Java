package com.raohui;

interface drawTest{
    public void draw();
}
class Quadrangle_new{
    public void doSometing(){
        System.out.println(this.getClass().getName());
    }
}

class Parallelogram_interface extends Quadrangle_new implements drawTest{
    public void draw(){
        System.out.println("Parallelogram_draw()");

    }
}
class Square_interface extends Quadrangle_new implements drawTest{
    public void draw(){
        System.out.println("Square draw()");

    }
}

class Anything extends Quadrangle_new{

}


public class interface_test {
    public static void main(String[] args) {
        drawTest d1 = new Parallelogram_interface();
        d1.draw();
        drawTest d2 = new Square_interface();
        d2.draw();

        Quadrangle_new q1 = new Parallelogram_interface();
        q1.doSometing();
        Quadrangle_new q2 = new Square_interface();
        q2.doSometing();
        Quadrangle_new q3 = new Anything();
        q3.doSometing();
    }
}
