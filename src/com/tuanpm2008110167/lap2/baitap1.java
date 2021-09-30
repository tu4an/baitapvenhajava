package com.tuanpm2008110167.lap2;
import java.util.Scanner;
public class baitap1 {
    public static void main(String[] agrs) 
    {
        Scanner Scanner = new Scanner (System.in);
        System.out.printf ("nhập a :");
        Float a = Scanner .nextFloat();
        System.out.printf ("nhập b :");
        Float b = Scanner .nextFloat();
        if(a == 0){ 
                System.out.println("thông báo vô nghiệm");
             }
            
            if(b == 0){
            System.out.println ("thông báo vô số nghiệm");  
            }
            else {
                Float nghiemx = -b/a;
                System.out.println ("nghiệm x là: " + nghiemx);
    }
}
}
    
    

