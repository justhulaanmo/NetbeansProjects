package com.mycompany.activity4_sarong;


public class Activity4_Sarong {

    public static void main(String[] args) {
        Food food = new Food();
        System.out.println(food.getType());
        
        Food fruit = new Fruit(); //nagreference kay class Food then si subclass ang obj
        System.out.println(fruit.getType());
        
        Food vegetable = new Vegetable();
        System.out.println(vegetable.getType());
    }
}

//kapag gagawa ng obj dpat naka reference kay super class then si subclass ang obj
