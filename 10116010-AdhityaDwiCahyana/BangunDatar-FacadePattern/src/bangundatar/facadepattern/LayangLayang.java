/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar.facadepattern;
import java.util.Scanner;
/**
 *
 * @author Adhitya Dwi Cahyana
 */
public class LayangLayang implements HasilHitungBangunDatar {
    double d1,d2,ab,cd;
    double hasilLuas, hasilKeliling;
    Scanner sc = new Scanner(System.in);
    @Override
    public void Luas(){
        System.out.println("Hitung Luas Layang-Layang");
        System.out.print("Diagonal 1 : ");
        d1 = sc.nextInt();
        System.out.print("Diagonal 2 : ");
        d2 = sc.nextInt();
        hasilLuas = 0.5 * d1 * d2;
        System.out.println("Hasil : " +hasilLuas);
        System.out.println("=============");
    }
    @Override
    public void Keliling(){
        System.out.println("Hitung Keliling Layang-Layang");
        System.out.print("sisi a dan c : ");
        ab = sc.nextInt();
        System.out.print("sisi b dan d : ");
        cd = sc.nextInt();
        hasilKeliling = 2 * (ab + cd);
        System.out.println("Hasil : " +hasilKeliling);
        System.out.println("=============");
    }
}
