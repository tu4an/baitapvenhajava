package com.tuanpm2008110167.lap3;
import java.util.Scanner;
public class baitap1 {
       public static void main(String args[])
       {
        var scanner = new Scanner(System.in);
        System.out.printf("nhập số nguyên tố: ");
        Float N = scanner.nextFloat ();
        boolean ok = true; 
        for(int i=2; i < N-1; i++)
        { 
        if(N % i == 0)
        { 
        ok = false; break;
        }        

            }
            if (ok) 
        {

         System.out.printf(" la so nguyen to");
        }
            else
        {
         System.out.printf(" khong phai la so nguyen to");
        }
    }}
  
   