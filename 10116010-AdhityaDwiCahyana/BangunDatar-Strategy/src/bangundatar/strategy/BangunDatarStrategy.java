/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar.strategy;

/**
 *
 * @author Adhitya Dwi Cahyana
 */
public class BangunDatarStrategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double d1,d2,ab,cd;
        double luaslayanglayang, kelilinglayanglayang;
        int KonversiLuaslayanglayang, KonversiKelilinglayanglayang;
        d1 = 20;
        d2 = 15;
        ab = 20;
        cd = 30;
        luaslayanglayang = 0.5 * d1 * d2;
        kelilinglayanglayang = 2 * (ab + cd);
        KonversiLuaslayanglayang = (int) Math.round(luaslayanglayang);
        KonversiKelilinglayanglayang = (int) Math.round(kelilinglayanglayang);
        HitungContext hitungcontext = new HitungContext(new LayangLayang());
        System.out.println("Luas Layang-Layang : "+hitungcontext.executeStrategy
                                                   (KonversiLuaslayanglayang));
        hitungcontext = new HitungContext(new LayangLayang());
        System.out.println("Keliling Layang-Layang : "+hitungcontext.executeStrategy
                                                   (KonversiKelilinglayanglayang));
    }
    
}
