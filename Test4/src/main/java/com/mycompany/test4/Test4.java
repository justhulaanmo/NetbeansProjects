package com.mycompany.test4;

public class Test4 {
    
    public void work(){
        System.out.println("employee is working");
    }
    public void breath(){
        System.out.println("employee is breathing\n");
    }

    public static class Manager extends Test4{
        @Override
        public void work(){
            System.out.println("manager: ayaw ko na magwork need ng pahinga\n");
        }
    }
     public static class FloorManager extends Test4{
        @Override
        public void work(){
            System.out.println("floormanager: same gusto ko na rin huminga");
        }
    }
    
    public static void main(String[] args) {
     
      Test4 human3 = new Test4();
      human3.work();
      human3.breath();
        
      Test4 human = new Manager();  
      human.work();
      
      Test4 human2 = new FloorManager();
      human2.work();
        
    }
}
