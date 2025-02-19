package com.mycompany.basta2;

public class Basta2 {

    String name, dialog;
    int hp,mp,lvl;
    
    Basta2(String name, String dialog, int hp, int mp, int lvl){
        this.name = name;
        this.dialog = dialog;
        this.hp = hp;
        this.mp = mp;
        this.lvl = lvl;
    }
    
    void introduce(){
        System.out.println("i am " + name);
    }
    
    public static void main(String[] args) {
        
        Basta2 c = new Basta2("bea", "hiii there", 100,50,50);
        c.introduce();
         
    } 
}
