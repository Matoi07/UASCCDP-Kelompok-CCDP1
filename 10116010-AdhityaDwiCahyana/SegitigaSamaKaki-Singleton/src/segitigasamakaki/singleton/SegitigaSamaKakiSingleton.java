/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segitigasamakaki.singleton;

/**
 *
 * @author Adhitya Dwi Cahyana
 */
public class SegitigaSamaKakiSingleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hitung hitung = Hitung.getHitung();
        hitung.HitungLuas();
        hitung.HitungKeliling();
    }
    
}
