package com.tuanpm2008110167.lap1;
import java.util.Scanner;
public class baitap4 {
    public static void main(String[] args)
     {
        Scanner Scanner = new Scanner (System.in);
        System.out.printf ("nhập a :");
        Float a = Scanner .nextFloat();
        System.out.printf ("nhập b :");
        Float b = Scanner .nextFloat();
        System.out.printf ("nhập c :");
        Float c = Scanner. nextFloat();
        Float delta = (b*b)-4*a*c;
        System.out.println(" delta: "+ delta);
        Float candelta = (float) Math. sqrt(delta);
        System.out.println (" căn delta:  " + candelta);

    }
    
}
