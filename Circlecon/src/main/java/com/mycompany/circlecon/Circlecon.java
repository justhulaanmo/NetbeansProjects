package com.mycompany.circlecon;
import java.util.Scanner;


public class Circlecon {

    public static void main(String[] args) {
        Scanner s = new Scanner ( System.in);
        
        System.out.println("enter:");
        double us = s.nextDouble();
        maincon m = new maincon (us);
        
        m.setRadius(us);
        
        System.out.println(m.getRadius());
        System.out.println(m.calculateCircumference());
    }
}
