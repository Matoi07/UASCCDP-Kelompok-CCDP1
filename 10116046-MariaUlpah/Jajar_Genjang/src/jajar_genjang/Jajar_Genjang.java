/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jajar_genjang;
/**
 *
 * @author maria ulfah
 */
public class Jajar_Genjang {
    
    public static void main (String[] args){
        // TODO code application logic here
        User Maya = new User("Maya");
        User Putri = new User("Putri");
        
        Maya.sendMessage("Put apakah kamu tahu cara menghitung luas dan keliling jajar_genjang?");
        Putri.sendMessage("Tentu, Cara menghitung luas = alas * tinggi, "
                + "sedangkan cara menghitung keliling adalah keliling = 2 * (alas + sisi_miring) " );
        
    }
           
    }
    

    

