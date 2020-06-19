package com.company;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int temp = sc.nextInt();
       int sum=0, rem,q, num;
       num=temp;
        while(num!=0) {
            rem = num % 10;
            sum = sum+ rem* rem * rem;
            num= num / 10;


        }
       if(temp == sum) {
           System.out.println(" It is an armstrong number");
       }
       else{
           System.out.println("It is not an armstrong number");
       }
    }
}
