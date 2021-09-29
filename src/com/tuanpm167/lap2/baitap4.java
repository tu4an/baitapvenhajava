package com.tuanpm167.lap2;
import java.util.Scanner;
public class baitap4 {
    public static void main(String[] args) {
 
        Scanner Scanner = new Scanner (System.in);
        int nhapso;
        System.out.println(" chọn các mục sau");
        System.out.println(" 1. giải phương trình bậc nhất");
        System.out.println(" 2. giải phương trình bậc hai"); 
        System.out.println(" 3. tính tiền điện");
        System.out.print("nhập mục cần tính: ");
        nhapso = Scanner . nextInt ();
        switch (nhapso) {
            case 1 :  baitap1. main(args);break;
            case 2:  baitap2. main(args);break;
            case 3:  baitap3. main(args);break;
            default: System.out.printf(" lỗi hệ thống");
                break;
        }

    }
    
}
