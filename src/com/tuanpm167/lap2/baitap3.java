package com.tuanpm167.lap2;
import java.util.Scanner;
public class baitap3 {
    
    public static void main(String [] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.printf ("nhập số điện = ");
        double a = scanner .nextDouble();
        if (a < 50){
            Double sodien = a*1000;
            System.out.printf ("số tiền phải trả là: " +sodien); }
            else {
             double sodien =  50*1000 + (a - 50)*1200;
             System.out.println (" số tiền phải trả là: " +sodien);
            }
        

    }
}
