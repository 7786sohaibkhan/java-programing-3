package com.company;

import java.util.Scanner;

public class Sequence2 {

    int no, num;

    void printSeq(int n,int k) {
        if (Math.abs(n) <= num) {
            if (n > 0) {
                System.out.print(" " + n);
                printSeq(n - k, k);
            }
            if (n <= 0) {
                no = n;
                System.out.print(" " + no);
                no = Math.abs(no);
                while (Math.abs(no) < num) {
                    no=no-k;
                    System.out.print(" " + Math.abs(no));
                }
            }

        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n= sc.nextInt();
       System.out.println("enter k");
       int k= sc.nextInt();
        Sequence2 s=new Sequence2();
        s.num=n;
        s.printSeq(n,k);

    }
}

