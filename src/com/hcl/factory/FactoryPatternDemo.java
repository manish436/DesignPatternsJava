package com.hcl.factory;

public class FactoryPatternDemo
{

    public static void main(String[] args)
    {
        Shape shape = ShapeFactory.getShapeInstance("Circle");
        shape = ShapeFactory.getShapeInstance("Rectangle");
        shape = ShapeFactory.getShapeInstance("Square");
        draw(shape);
    }


    private static void draw(Shape shape)
    {
        shape.draw();
    }

}
