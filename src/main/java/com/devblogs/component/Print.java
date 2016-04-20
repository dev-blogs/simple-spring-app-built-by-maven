package com.devblogs.component;
 
import com.devblogs.component.figure.Figure;
 
public class Print {
    private Figure figure;
 
    public Print() {
        System.out.println("Bean print is being created");
    }
 
    public void setFigure(Figure figure) {
        this.figure = figure;
    }
 
    public void showSquare() {
        System.out.println("Square of " + this.figure.getName() + " is " + this.figure.getSquare());
    }
}