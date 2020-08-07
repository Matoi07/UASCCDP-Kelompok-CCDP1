/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersegiPanjang;

/**
 *
 * @author AnggiPC
 */
public class Hitung_PersegiPanjang {
    private HasilHitung persegipanjang;
    public Hitung_PersegiPanjang(){
        persegipanjang = new Persegi_Panjang();
    }
    public void HasilHitung_PersegiPanjang(){
        System.out.println("Persegi Panjang");
        System.out.println("===================================");
        persegipanjang.Luas();
        persegipanjang.Keliling();
    }
}

