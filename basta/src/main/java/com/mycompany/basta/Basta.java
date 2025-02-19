package com.mycompany.basta;
import java.util.Scanner;
public class Basta {

    public int divide (int num1, int num2){
        
        return num1 / num2;
    }
    
    public class simplecalculator extends Basta{
        @Override
        public int divide(int num1, int num2){
            if (num2 != 0){
                System.out.println("no to 0 in num2");   
                           
            }  
            return 0;
        }
    
    }
    
    public static void main(String[] args) {
        
      
       
    }
    
}
