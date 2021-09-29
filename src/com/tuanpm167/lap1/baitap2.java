package com.tuanpm167.lap1;
import java.util.Scanner;
public class baitap2 {
    public static void main(String[] args) 
    {
       Scanner scanner = new Scanner (System.in) ;
       System.out.print (" nhập chiều dài: ");
       double a = scanner.nextDouble();
       System.out.print (" nhập chiều rộng");
       double b = scanner.nextDouble (); 
       Double chuvi = (a+b)*2;
        System.out.println("chu vi : "+ chuvi);
        Double dientich = (a*b);
        System.out.println("dientich : " +dientich); 
        Double canhnhonhat = Math . min (a,b);
        System.out.println("cạnh nhỏ nhất: "+ canhnhonhat);

    
    }
}
