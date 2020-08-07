/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import java.util.Scanner;
import static java.lang.Math.sqrt;
/**
 *
 * @author AnggiPC
 */
public class Segitiga {

    double a, t;
    double luas;
    double hasilsisimiring;
    private static Segitiga hitung;
    Scanner keyboard = new Scanner(System.in);
    private Segitiga(){
        System.out.println("Menghitung Luas Segitiga");
    }
    public static synchronized Segitiga getSegitiga_HitungLuas(){
        if(hitung==null){
            hitung=new Segitiga();
        }
        return hitung;
    }
    public Void HitungLuas () {
    System.out.print("Masukkan panjang alas: ");
    a = keyboard.nextInt();
    System.out.print("Masukkan tinggi segitiga: ");
    t = keyboard.nextInt();
    luas = 0.5 * a * t;
    System.out.println("Luas segitiga adalah "+luas);
        return null;
    }
         public void HitungSisiMiring(){
         System.out.println("");
        System.out.println("Fungsi Menghitung Sisi Miring Segitiga");
        System.out.print("Masukkan Alas : ");
        a = keyboard.nextInt();
        System.out.print("Masukkan Tinggi : ");
        t = keyboard.nextInt();
        hasilsisimiring = sqrt((a*a)+(t*t)); 
        System.out.println("Sisi Miring segitiga adalah "+hasilsisimiring);   
  }
}
