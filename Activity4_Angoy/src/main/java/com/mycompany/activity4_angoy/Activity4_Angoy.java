/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.activity4_angoy;


    class Animal {
        public void sound() {
            System.out.println("Arf");
        }
    }
     class Mammal extends Animal {
         @Override
         public void sound() {
             System.out.println("Rawr");
         }
     }
      class Human extends Mammal{
          @Override
          public void sound() {
              System.out.println("Iloveyou");
          }
      }
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal mammal = new Mammal();
        Animal human = new Human();
        animal.sound();
        mammal.sound();
        human.sound();
    }
}
