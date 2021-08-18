package com.opencodeonce;

import java.text.*;
import java.util.*;
public class Main {

    public static void main(String []args){
        final byte MONTHINYEAR=12;
        final byte PERCENT=100;
        Scanner sc=new Scanner(System.in);

        System.out.print("Principal :");
        int principal=sc.nextInt();

        System.out.print("Annual Interest Rate :");
        float interest=sc.nextFloat();
        float monthrate= interest/PERCENT/MONTHINYEAR;

        System.out.print("Period(Years) :");
        int year=sc.nextInt();
        float power= (float) Math.pow(1+monthrate,year*MONTHINYEAR);
        double mortgage = principal*((monthrate*power)/(power-1));
        String amount=NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortage :"+amount);
    }
}