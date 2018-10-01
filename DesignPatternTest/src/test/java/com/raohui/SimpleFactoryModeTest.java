package com.raohui;

import com.raohui.simplefactorymode.Graphic;
import com.raohui.simplefactorymode.GraphicFactory;
import org.junit.Test;

public class SimpleFactoryModeTest {
    @Test
    public  void test(){
        try{
            Graphic graphic = GraphicFactory.getGraphic("rorrund");
            graphic.draw();
            graphic.delete();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
