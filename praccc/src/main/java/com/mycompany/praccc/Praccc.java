package com.mycompany.praccc;
import java.util.Scanner;
public class Praccc {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter limit: \n");
        int limit=sc.nextInt();
        
        for(int i=1; i<=limit;i++){
            if(i%3==0&&i%5==0){
                System.out.println("BISU BAL");
            }
            else if(i%3==0) {
                System.out.println("BISU");
            } else if(i%5==0) {
                System.out.println("BAL");
            }
            else {
                System.out.println(i);
            }
        }
    }
    
}
    

