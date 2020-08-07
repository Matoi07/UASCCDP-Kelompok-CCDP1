/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Belah_Ketupat;


/**
 *
 * @author AnggiPC
 */
public class Subject {

 private String kata;

   public String getKata() {
      return kata;
   }

   public void setKata(String kata) {
      this.kata = kata;
   }

   public Subject(String kata){
      this.kata  = kata;
   }
   
   public void sendMessage(String message){
      BelahKetupat.showMessage(this,message);
   }
}
    
      /*  int diagonal1,diagonal2,keliling,luas,sisi;
        Scanner S=new Scanner (System.in);
       
        System.out.print("Masukkan Diagonal-1 : ");
        diagonal1=S.nextInt();
       
        System.out.print("Masukkan Diagonal-2 : ");
        diagonal2=S.nextInt();
       
        System.out.print("Masukkan Sisi : ");
        sisi=S.nextInt();
       
        luas=(diagonal1*diagonal2)/2;
        System.out.println("Luas Belah Ketupat = "+luas);
       
        keliling=(4*sisi);
        System.out.println("Keliling Belah Ketupat = "+keliling);
    }*/

   


