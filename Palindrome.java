package com.company;
import java.util.Scanner;

public class Palindrome{
    int n;
    int sum =0;

    int checkPalindrome(int n) {
        if (n <= 0) {
            return sum;
        } else {

            sum = (sum * 10) + n % 10;
            return checkPalindrome(n / 10);
        }


    }

    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int temp=n;

        Palindrome p =new Palindrome();
        p.checkPalindrome( n);
        if(p.sum==temp){
            System.out.println("It is apalindrome");

        }
        else{
            System.out.println("It is not a palindrome");
        }


    }
}
