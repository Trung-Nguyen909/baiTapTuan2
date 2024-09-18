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
public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so tien gui: ");
        double soTienGui = scanner.nextDouble();

        System.out.print("Nhap lai suat hang nam (%): ");
        double laiSuatHangNam = scanner.nextDouble();

        System.out.print("Nhap so thang gui: ");
        int soThangGui = scanner.nextInt();

        double laiSuatHangThang = laiSuatHangNam / 12 / 100; // Lai suat hang thang
        double tongLai = soTienGui * laiSuatHangThang * soThangGui; // Tong lai
        double soTienGocCuoiKy = soTienGui + tongLai; // So tien goc cuoi ky

        System.out.println("So tien lai: " + tongLai);
        System.out.println("So tien goc cuoi ky: " + soTienGocCuoiKy);
    }
}
