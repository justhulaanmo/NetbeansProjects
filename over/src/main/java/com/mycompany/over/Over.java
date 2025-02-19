package com.mycompany.over;

public class Over {
    
    private String name,lastname,title,address,sex;
    private int age;
    
    Over(String name, String lastname, String title, 
            String address, String sex, int age){
    
        this.name = name;
        this.lastname = lastname;
        this.title = title;
        this.address = address;
        this.sex = sex;
        this.age = age;
        
    }
    
    Over(String name, String lastname, String title){
        this.name = name;
        this.lastname = lastname;
        this.title = title;
        
    }
    
    
    public static void main(String[] args) {
        Over e = new Over("BEA", "SARONG", "PROGRAMMER", "EARTH", "FEMALE", 22);
        Over e1 = new Over("arjle", "balaba","tourism");
        
     // e.firstname();
        
       // System.out.println(Over.e);
    }
}

