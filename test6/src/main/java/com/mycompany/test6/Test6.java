package com.mycompany.test6;


 class Test {
    
    public void MyInfo() {
        System.out.println("i am a human");
    }

    
     class student extends Test{
        @Override
        public void MyInfo(){
            super.MyInfo();
            System.out.println("i am a student");
        } 
    
    public class Test6{
    public static void main(String[] args) {
       student obj = new student();
       obj.MyInfo();
    }
}
    }
 }
