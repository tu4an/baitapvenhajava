package com.tuanpm2008110167.lap3;
import java.util.Arrays;
import java.util.Scanner;
public class baitap3 {
 public static void main(String[] args) {
        int mang[] = new int[5] ;
     Scanner scanner = new Scanner (System.in);
     for (int i = 0; i < mang.length; i++ ) {

         System.out.printf ( "nhập phần tử % ", (i+1) );
         mang [i] = scanner.nextInt();
        }
         System.out.println ("phần tử mang: " + Arrays.toString(mang));
            Arrays.sort(mang);
        System.out.println(" phần tử sau khi sắp xếp: " +Arrays.toString(mang));
        int min = mang [0];
        for ( int i = 1; i < mang.length; i++)
        { min = Math.min (min, mang[i]); }
        System.out.println ("số nhỏ nhất là: " +min);
        int sum = 0, count = 0 ;
        for ( int i = 0; i < mang.length; i++){
            if (mang[i] % 3 == 0 ){
                sum += mang [i];
                count ++;
            }
        }
        float avg = (float) sum/ count;
        System.out.println (" giá trị trung bình là: " + avg );
    }
}
