package com.raohui.simplefactorymode;

public class GraphicFactory {
    public static Graphic getGraphic(String type) throws UnSupportedShapeException{
        Graphic graphic = null;
        if(type.equals("round")){
            System.out.println("创建圆形!");
            graphic = new RoundGraphic();
        }else if(type.equals("triangle")){
            System.out.println("创建三角形!");
            graphic =  new TriangleGraphic();
        }
        if(graphic == null){
            throw new UnSupportedShapeException("不支持的图形!");
        }
        return graphic;
    }
}
