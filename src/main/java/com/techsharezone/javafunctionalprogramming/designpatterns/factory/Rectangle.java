package com.techsharezone.javafunctionalprogramming.designpatterns.factory;

public class Rectangle implements Shape
{
    @Override
    public void draw()
    {
        System.out.println("Inside Rectagnle::draw() method.");
    }
}
