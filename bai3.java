/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author khoam
 */
public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so thu nhat: ");
        int num1 = scanner.nextInt();

        System.out.print("Nhap so thu hai: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        int remainder = num1 % num2;

        System.out.println("Tong: " + sum);
        System.out.println("Hieu: " + difference);
        System.out.println("Tich: " + product);
        System.out.println("Thuong: " + quotient);
        System.out.println("Phan du: " + remainder);
    }
}
