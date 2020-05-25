package com.hcl.factory;

public class ShapeFactory
{
    public static Shape getShapeInstance(String shapeType)
    {
        Shape shapeObject = null;

        switch (shapeType)
        {
            case "Circle":
                shapeObject = new Circle();
                break;
            case "Rectangle":
                shapeObject = new Rectangle();
                break;
            case "Square":
                shapeObject = new Square();
                break;
        }

        return shapeObject;
    }

}
