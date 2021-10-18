package com.tuanpm2008110167.lap3;
import java.util.Scanner;
public class baitap4 {
    private static Scanner input;
    public static void main(String [] args) {
        input = new Scanner(System.in);
			System.out.print("Nhap so luong sinh vien = ");
			int n = input.nextInt();
			String[] A=new String[n];
			
			for(int i=0;i<n;i++) {
				System.out.println("- Nhap thong tin sinh vien thu "+i+" : ");
				System.out.print("Ho ten sv: ");
				input.nextLine();
				A[i]=input.nextLine();
				
			}
			int B[]=new int[n];
			for(int i=0;i<n;i++) {
				System.out.println("- Nhap thong tin sinh vien thu "+i+" : ");
				System.out.print("Diem : ");
				B[i]=input.nextInt();
			}
			for(int i=0;i<n;i++) {
				if(B[i]<5) {
					System.out.println("Ten : "+A[i]+"\n Diem: "+B[i]+"\nHoc Luc: yeu");
				}
				if(B[i]>5 && B[i]<6.5) {

					System.out.println("Ten : "+A[i]+"\n Diem: "+B[i]+"\nHoc Luc: trung binh");
				}
				if(B[i]>=6.5 && B[i]<7.5) {

					System.out.println("Ten : "+A[i]+"\n Diem: "+B[i]+"\nHoc Luc: kha");
				}
				if(B[i]>=7.5 && B[i]<9) {

					System.out.println("Ten : "+A[i]+"\n Diem: "+B[i]+"\nHoc Luc: gioi");
				}
				if(B[i ]>=9) {

					System.out.println("Ten : "+A[i]+"\n Diem: "+B[i]+"\nHoc Luc: xuat sac");
				}
			} 
    }
    
}
