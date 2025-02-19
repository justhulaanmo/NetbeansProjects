package com.mycompany.test5;

 
public class Test5 {    
   public static void display() {
      
        System.out.println("This is from Base class");
    
}
   
     class Derived extends Test5 {
   public static void display() {
        System.out.println("This is from Derived class");
    }

public class main{
    public static void main(String[] args) {
       // Derived dd = new Derived();
        
        Test5.display(); 
        Derived.display();

    }
}
        } 

}