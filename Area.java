package com.company;

import java.util.Scanner;



class Area1{

    int l,b;
    void setDim(){
        System.out.println("To get area of rectangle");
        System.out.println("Enter length");
        Scanner sc = new Scanner(System.in);
        l = sc.nextInt();
        System.out.println("Enter breadth");
        b = sc.nextInt();


    }
    int getArea(){
        int area = l * b;
        return area;
    }

}


public class Area {
    public static void main(String[] args){
        //Scanner sc = new Scanner();
        Area1 a =new Area1();
        a.setDim();
        System.out.println("Area of rectangle = " +a.getArea());



    }
}


