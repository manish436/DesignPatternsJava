package com.hcl.factory;

public class Rectangle implements Shape
{

    @Override
    public void draw()
    {
        System.out.println(this.getClass().getName());
    }

}
