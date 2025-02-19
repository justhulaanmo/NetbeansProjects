package com.mycompany.basta;


public class person {
    String firstname, lastname;
    char sex;
    int age;
    
    person(String firstname, String lastname, char sex, int age){
        this.firstname = firstname;
        this.lastname = lastname;
        this.sex = sex;
        this.age = age;
        
        System.out.println("my name is " + firstname + lastname + " my sex is " + sex + " i am " + age + " years old");
    }
}
