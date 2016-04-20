package com.devblogs.component.figure;
 
public class Rectangle extends Figure {
    private int length;
    private int width;
    
    public Rectangle() {
    	super("rectangle");
    }
      
    public Rectangle(String name, int length, int width) {
        super(name);
        this.length = length;
        this.width = width;
    }
    
    public void setWidth(int width) {
    	this.width = width;
    }
    
    public void setLength(int length) {
    	this.length = length;
    }
 
    public double getSquare() {
        return this.length*this.width;
    }
}
