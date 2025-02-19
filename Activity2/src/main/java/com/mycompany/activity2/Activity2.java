
package com.mycompany.activity2;
import java.util.Scanner;

public class Activity2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        char choice;
        do{
        System.out.println("Type a number to determine Odd or Even: ");
        num=sc.nextInt();
        
        if (num==0){
            System.out.println("you input is 0");
        }
         else if(num<0){
            System.out.println("negative");
        }
         else if(num%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }  
        
         System.out.println("you want 10 points? y/n");
         choice=sc.next().charAt(0);
        if (choice!='y'||choice!='Y'){
                System.out.println("you want 10 points? y/n");
         }
        else {
             System.out.println("invalid");
        }
        }
}
}

    

        
               
    

