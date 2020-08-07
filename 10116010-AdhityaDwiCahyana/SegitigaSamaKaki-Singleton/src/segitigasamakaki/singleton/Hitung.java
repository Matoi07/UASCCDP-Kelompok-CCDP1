/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segitigasamakaki.singleton;
import java.util.Scanner;
/**
 *
 * @author Adhitya Dwi Cahyana
 */
public class Hitung {
    double alas;
    double tinggi;
    double hasilLuas;
    double hasilKeliling;
    private static Hitung hitung;
    Scanner keyboard = new Scanner(System.in);
    private Hitung(){
        System.out.println("Menghitung Luas dan Keliling Segitiga Sama Kaki");
    }
    public static synchronized Hitung getHitung(){
        if(hitung==null){
            hitung=new Hitung();
        }
        return hitung;
    }
    public void HitungLuas(){
        System.out.println("Fungsi Menghitung Luas Segitiga Sama Kaki");
        System.out.print("Masukkan Alas : ");
        alas = keyboard.nextInt();
        System.out.print("Masukkan Tinggi : ");
        tinggi = keyboard.nextInt();
        hasilLuas = 2 * (0.5 * alas*tinggi);
        System.out.println(hasilLuas);
    }
    public void HitungKeliling(){
        System.out.println("Fungsi Menghitung Keliling Segitiga Sama Kaki");
        System.out.print("Masukkan Alas : ");
        alas = keyboard.nextInt();
        System.out.print("Masukkan Tinggi : ");
        tinggi = keyboard.nextInt();
        hasilKeliling = alas * tinggi;
        System.out.println(hasilKeliling);
    }
}
