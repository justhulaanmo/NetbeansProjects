package com.mycompany.test2;
import java.util.Scanner;


 public class Test2{  
     
     
    
    public int divide(int num1, int num2){
      
      return num1 / num2;
}
    
       // int num1, num2;
    public class SimpleCalculator extends Test2{
        @Override
        public int divide (int num1, int num2){   
        
       // this.num1 = num1;
        //this.num2 = num2;    
        
         if (num2 == 0){
         
             System.out.println("Error! cant divide to 0");
         }
       return 0;
        }
    } 
    

    public static void main(String[] args) {
       
        
        Test2 t = new Test2();
        
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter 1st number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter 2ns number: ");
        int num2 = scanner.nextInt();
        int result = t.divide(num1,num2);
        System.out.println("Result: " +result);
        
    }
}
 