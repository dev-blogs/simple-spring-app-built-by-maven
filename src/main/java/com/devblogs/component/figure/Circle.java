package com.devblogs.component.figure;
 
public class Circle extends Figure {
    private int radius;
    public static double PI = 3.1415;
    private String name;
      
    public Circle(String name, int radius) {
        super(name);
        this.radius = radius;
    }
    
    public void setRadius(int radius) {
    	this.radius = radius;
    }
  
    public double getSquare() {
        return PI*this.radius*this.radius;
    }
}
