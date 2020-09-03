package com.meng.clone;

public class Rectangle extends Shape{
    public  Rectangle(){
        type = "rectangel";
    }
    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
