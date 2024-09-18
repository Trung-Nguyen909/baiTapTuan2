/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai4;
import java.util.Scanner;
public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("nhap vao so tien gui: ");
        int gui= scanner.nextInt();
        System.out.print("nhap vao lai suat hang nam: ");
        double lai= scanner.nextDouble();
        System.out.print("nhap vao so thang gui: ");
        int thang= scanner.nextInt();
        double tienlai= gui*lai*(thang/12);
        double tiengoc=gui*Math.pow((1+lai),thang/12);
        System.out.print("so tien lai la: " + tienlai);
        System.out.print("\nso tien goc cuoi ki la: " + tiengoc);
        
    }
    
}
