package com.opencodeonce;  //change this to your package name

import java.text.NumberFormat;
import java.util.Scanner;
import java.lang.*;

public class Main {
public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);

    final byte MONTH=12;
    final byte PERCENTAGE=100;
    long principal;
    float interest;
    int year;
    double mortgage;
    while(true){
        System.out.print("Principal (1K-1M):");
        principal= sc.nextLong();
        if(principal>=1000 && principal<=1000000){
            System.out.println("Your Principal is:"+principal);
            break;
        }
        System.out.println("Please enter principal between 1K and 1M");
        }
    while (true){
        System.out.print("Annual Rate of Intersest:");
        interest=sc.nextFloat();
        if(interest>0 && interest<=30){
            System.out.println("Your Annual Rate of Interest is:"+interest);
            break;
    }
        System.out.println("Please enter interest greater than 0 and lesser than or equal to 30");
    }
    while (true){
        System.out.print("Period(years):");
        year=sc.nextInt();
        if(year>0 && year<=30){
            System.out.println("Your Period(year) is:"+year);
            break;
        }
        System.out.println("Please enter year greater than 0 and lesser than or equal to 30");
    }
    
    //mortage calculation: mortage= principal * ((rate)(1+rate)^noyear) / ((1+rate)^noyear-1)
    float rate= (interest/PERCENTAGE/MONTH);

    float pow= (float) Math.pow((1+rate),year*MONTH);
    //int total=(int)((rate*pow)/pow-1);
    mortgage=principal*((rate*pow)/(pow-1));
    String total= NumberFormat.getCurrencyInstance().format(mortgage);
    System.out.println("Mortgage:"+total);


}

}
