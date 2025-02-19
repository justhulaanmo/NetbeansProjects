
package com.mycompany.circlecon;


public class maincon {
    private double radius;
    maincon (double radius) {
        this.radius = radius;
    }
 void setRadius (double radius) {
         this.radius = radius;
}
 double getRadius () {
     return radius;
 }
 
 double calculateCircumference () {
     return 2 * Math.PI * radius;
}


}










 /*public void setRadius(double radius){
        this.radius = radius;
    }*/