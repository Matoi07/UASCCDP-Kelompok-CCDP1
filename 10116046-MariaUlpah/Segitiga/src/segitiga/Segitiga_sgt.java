/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segitiga;
import java.util.Scanner;

/**
 *
 * @author maria ulfah
 */
public class Segitiga_sgt {
    int alas, tinggi, sisi2, sisi3;
    int Keliling;
    int Segitiga;
    Scanner input = new Scanner(System.in);
    public void Keliling(){
        System.out.print("Masukkan Alas(cm) : ");
        alas = input.nextInt();
        System.out.print("\nMasukkan Tinggi(cm) : ");
        tinggi = input.nextInt();
        System.out.print("\nMasukkan Sisi 2(cm) : ");
        sisi2 = input.nextInt();
        System.out.print("\nMasukkan Sisi 3(cm) : ");
        sisi3 = input.nextInt();
        System.out.println("Keliling Persegi Panjang = "+Keliling);
        
        int totsi = alas + sisi2 + sisi3;
        System.out.println("Keliling segitiga = "+Keliling);
        System.out.println("===========================");
     
        int sis1 = 0;
        int sis2 = 0;
        System.out.print("\nMasukkan sisi b(cm) : ");
        sis1 = input.nextInt();
        System.out.print("\nMasukkan sisi a(cm) : ");
        sis2 = input.nextInt();
        System.out.println("");
        System.out.println("===========================");
        System.out.println("Hasil phytagoras : ");
        
             
    }
    
}
