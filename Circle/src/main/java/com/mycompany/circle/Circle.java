package com.mycompany.circle;
public class Circle {

    
    private double radius;
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public double calculateCircumference(){
        return 2 * Math.PI * radius;
        
    }

}        

