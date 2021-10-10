package com.tuanpm2008110167.lap1;
import java.util.Scanner;
public class baitap1 {   
public static void main(String[] args)
 {
      Scanner scanner = new Scanner (System.in);
     System.out.print("Họ và tên: ");
    String hoten = scanner.nextLine();
     System.out.print("Điểm TB: ");
    double diemTB = scanner.nextDouble();
   System.out.printf( " %s%f diem ", hoten, diemTB);
 }
}