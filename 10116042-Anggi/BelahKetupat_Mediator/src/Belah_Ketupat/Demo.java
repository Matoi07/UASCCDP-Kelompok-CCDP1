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
public class Demo {
    public static void main(String[] args) {
        
      Subject AB = new Subject("Anggi");
      Subject CD = new Subject("Maria");
      Subject EF = new Subject("Anggi");
      
      Subject GH = new Subject("Maria");
      Subject IJ = new Subject("Anggi");
      Subject KL = new Subject("Maria");
      
      
      
      AB.sendMessage("Apakah kamu tau rumus luas dan keliling belah ketupat?");
      CD.sendMessage("Ya, Anggi");
      EF.sendMessage("Apa Maria?");
     
      GH.sendMessage("Luas = (diagonal1*diagonal2)/2 dan Keliling = 4*sisi");
      IJ.sendMessage("Baiklah, Terimakasih");
      KL.sendMessage("Sama-Sama");
    } 
}

