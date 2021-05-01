package com.test;

import java.util.Random;

public class GenerationShape {
    private static Random random = new Random();
    public Shape next(){
        switch (random.nextInt(3)+1){
            default:
            case 1: return new Circle();
            case 2: return new Square();
            case 3: return new Triangle();
        }
    }
}
