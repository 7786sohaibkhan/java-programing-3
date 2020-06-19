package com.company;
import java.util.Scanner;

class complex1{
    Scanner sc =new Scanner(System.in);
    double real,img,real1,img1,real2,img2;
    void getNumber(){
        System.out.println("enter complex number");
        System.out.println("real part");
        real1= sc.nextInt();
        System.out.println("imaginary part");
        img1= sc.nextInt();
        System.out.println("enter second  complex number");
        System.out.println("real part");
        real2= sc.nextInt();
        System.out.println("imaginary part");
        img2= sc.nextInt();

    }
    void sum(){

        this.real = real1 + real2;
        this.img = img1 + img2;
        System.out.println("sum  = "+this.real+" + "+this.img+"i");

    }
    void diff(){

        this.real = real1 - real2;
        this.img = img1 - img2;
        System.out.println("difference =  "+this.real+" + "+this.img+"i");

    }
    void mul() {

        this.real = (real1*real2 - img1*img2);
      this.img = (real1*img2 + real2*img1);
        System.out.println("product = " + this.real + " + " + this.img + "i");

    }
}

public class Complex {
    public static void main(String[] args){
        System.out.println("enter first number");

      complex1 a1 =new complex1();
      a1.getNumber();
      a1.sum();
      a1.diff();
      a1.mul();
    }
}
