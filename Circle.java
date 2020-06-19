package com.company;
import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.util.Scanner;

class Circle1 {
    private double radius =1.0;
    private String color="red";
    Circle1(){}
    Circle1(double r){
        this.radius =r;
    }
   public double getRadius(){


      return this.radius;
   }
   public double getArea(){
        double area = Math.PI * radius* radius ;
       return area;
   }

}
public class Circle{
     public static void main(String[] args){
         Circle1 c =new Circle1();
         System.out.println("Area = " +c.getRadius());

         System.out.println("Area = " +c.getArea());


     }

}
