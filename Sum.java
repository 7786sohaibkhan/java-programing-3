package com.company;
import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Sum {
    int  n,sum=0,rem;
    public int getSum(int n){
        if(n<=0){
            return sum;
        }
        else{
        rem=n%10;
        sum =sum + rem;
        return getSum(n/10);}
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        Sum s =new Sum();
        int s1= s.getSum(n);
        System.out.println("sum of the number = "+s1);

    }
}
