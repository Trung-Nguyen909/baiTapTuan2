package Tuanso2;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args){
        System.out.println("Nhập 2 số: ");
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int tong= x+y;
        int hieu= x-y;
        int tich = x*y;
        int thuong=0;
        if(y==0) System.out.println("Không tính được.");
        else thuong=x/y;
        int du = x%y;
        System.out.println("Tổng: "+tong+"\n"+"Hiệu: "+hieu+"\n"+"Tích: "+tich+"\n"+"Thương: "+thuong+"\n"+"Chia lấy phần dư: "+du);
    }
}
