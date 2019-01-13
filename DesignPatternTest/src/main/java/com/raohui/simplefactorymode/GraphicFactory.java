package com.raohui.simplefactorymode;

public class GraphicFactory {
    public static Graphic getGraphic(String type) throws UnSupportedShapeException{
        Graphic graphic = null;
        if(type.equals("round")){
            System.out.println("create round!");
            graphic = new RoundGraphic();
        }else if(type.equals("triangle")){
            System.out.println("create triangle!");
            graphic =  new TriangleGraphic();
        }
        if(graphic == null){
            throw new UnSupportedShapeException("unsupport!");
        }
        return graphic;
    }
}
