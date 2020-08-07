/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersegiPanjang;
import java.util.Scanner;
/**
 *
 * @author AnggiPC
 */

public class Persegi_Panjang implements HasilHitung {
    int panjang , lebar ;
    int Luas , Keliling ;
    Scanner nilai = new Scanner (System.in);
           
    public void Luas(){
           System.out.println("Menghitung Luas Persegi Panjang");
           System.out.print("Masukan panjang = ");
           panjang = nilai.nextInt();
           System.out.print("Masukan lebar = ");
           lebar = nilai.nextInt();
           Luas = panjang * lebar;
           System.out.println("Luas Persegi Panjang = "+Luas);  
           System.out.println("===================================");
           
    }
    public void Keliling(){
           System.out.println("Menghitung Keliling Persegi Panjang");
           System.out.print("Masukan panjang = ");
           panjang = nilai.nextInt();
           System.out.print("Masukan lebar = ");
           lebar = nilai.nextInt();
           Keliling = 2*panjang + 2*lebar;
           System.out.println("Keliling Persegi Panjang = "+Keliling);
             
    }
}
 