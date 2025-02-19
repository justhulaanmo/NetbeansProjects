package com.mycompany.activity4_sarong;

 public class Food { //superclass
     
    public String getType() { //method String ang gagamitin para maka return ng word na "FOOD"
        return "Food";
    }
 }
    class Fruit extends Food{ //sublclass
        @Override
        public String getType(){ //inooveride ko ung getType 
            return "fav fruit: grapes ata";
        }
    }
    class Vegetable extends Food{ //2ND subclass
        @Override
        public String getType(){
            return "basta masustansya ang vegetable hahahahahhahaha";
        }
    }
   

