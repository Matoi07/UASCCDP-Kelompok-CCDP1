/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar.facadepattern;

/**
 *
 * @author Adhitya Dwi Cahyana
 */
public class HitungIntegrator {
    private HasilHitungBangunDatar layanglayang;
    public HitungIntegrator(){
        layanglayang = new LayangLayang();
    }
    public void HasilHitungLayangLayang(){
        System.out.println("Layang-Layang");
        layanglayang.Luas();
        layanglayang.Keliling();
    }
}
