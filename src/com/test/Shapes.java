package com.test;

public class Shapes {
    private static GenerationShape gen = new GenerationShape();

    public static void main(String[] args) {
        Shape[] shapes = new Shape[9];
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = gen.next();
        }
        for (Shape x:shapes) {
            x.draw();
        }
    }
}
