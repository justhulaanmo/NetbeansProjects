package com.mycompany.prac;
import java.util.Scanner;

class Student{
    private String studentID, name;
    private double grade;
    
    public Student (String studentID, String name, double grade){
        this.studentID = studentID;
        this.name = name;
        this.grade = validateGrade(grade);
    }
    
    public void setGrade (double grade){
        this.grade = validateGrade(grade);
    }
    
    public double getGrade(){
        return grade;
    }
    
    public String getStudentInfo(){
        return "\n Student ID: " + studentID + "\n Name: " + name + "\n Grade: " + grade;
    }
    
    private double validateGrade(double grade){
        if (grade < 0 || grade > 100){
            System.out.println("grade must be between 0 and 100");
        }
        return grade;
    }
}


public class PRAC {

    public static void main(String[] args) {
        Student student = new Student ("bea", "beaaa", 70);
        System.out.println("initial student info: "+ student.getStudentInfo());
        student.setGrade(900);
        System.out.println("\n Updated student info: "+ student.getStudentInfo());
        
    }
}
