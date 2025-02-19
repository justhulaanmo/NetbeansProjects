/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.main;

/**
 *
 * @author beasarong
 */

class CatMAIN{

   
    public static void main(String[] args) {
        
        CATCLASS c = new CATCLASS();
        
        
        c.name = "Dog";
        c.breed = "Husky";
        
        System.out.println(c.info());
       System.out.println(c.breed);
        
    }
    
   
}
