
package com.mycompany.circle;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
            
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: "); //user enter the radius
        double user = sc.nextDouble();
        
        Circle cr = new Circle(); //accessing Main class
        cr.setRadius(user); //giving an input to setRadius class
       
        System.out.println("The circumference: " + cr.calculateCircumference()); //accessing circum class
    }
    
    
    
    
    
    
    }

