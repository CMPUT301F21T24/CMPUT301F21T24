// This file is ectends Shape Class.
package com.example.cmput301f21t24;

public class Circle extends Shape{
    private static int PI = 3.14;
    private int circumference;
    private int area;
    
    public Circle(int circumference, int area){
        this.circumference = circumference;
        this.area = area;
    }
}
