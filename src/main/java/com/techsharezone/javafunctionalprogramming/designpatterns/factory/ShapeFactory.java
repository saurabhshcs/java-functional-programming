package com.techsharezone.javafunctionalprogramming.designpatterns.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ShapeFactory
{
    final static Map<String, Supplier<Shape>> map = new HashMap<>();

    private static final String CIRCLE = "CIRCLE";

    private static final String RECTANGLE = "RECTANGLE";
    private static final String NO_SUCH_SHAPE = "No such shape";

    static {
        map.put(CIRCLE, Circle::new);
        map.put(RECTANGLE, Rectangle::new);
    }
    public Shape getShape(String shapeType){
        Supplier<Shape> shape = map.get(shapeType.toUpperCase());
        if(shape != null) {
            return shape.get();
        }
        throw new IllegalArgumentException(NO_SUCH_SHAPE  + shapeType.toUpperCase());
    }
}
