package Tuanso2;

import java.util.Scanner;

public class  Bai4 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập số tiền gửi: ");
        int tiengoc= sc.nextInt();
        System.out.println("Nhập số lãi suất trên năm: ");
        double laisuat = sc.nextDouble();
        System.out.println("Nhập số tháng gửi: ");
        int thanggui = sc.nextInt();
        double tienlai = tiengoc*laisuat/100/12*thanggui;
        System.out.println("Số tiền lãi là: "+tienlai);
        System.out.println("Số tiền gốc cuối kì: "+(tienlai+tiengoc));
    }
}