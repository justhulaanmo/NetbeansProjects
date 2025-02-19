package com.mycompany.test3;
import java.util.Scanner;

abstract class Test3 {
    abstract void click();
    
   static class add extends Test3{
        @Override
        void click(){
            System.out.println("adding na ta");
        }
    }
    
   static class delete extends Test3{
        @Override
        void click(){
            System.out.println("deleting pa ko wait sa");
        }
    }
    static class clear extends Test3{
        @Override
        void click(){
            System.out.println("clearing operation na");
        }
    }
    

    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       System.out.print("Type a number \n 1. Add\n 2. Delete \n 3. Clear \n\n Enter a number: ");
       int choice = sc.nextInt();
      
       Test3 button; //dynamic method 
       
       if (choice == 1){
          button  = new add();
       } 
       else if (choice == 2){
           button = new delete();
       } 
       else if (choice == 3){
           button = new clear();
       }
       else {
           System.out.print("invalid input");
           return;
       }
       
       button.click();
    }
}
