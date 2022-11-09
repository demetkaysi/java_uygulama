/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru4;

import java.util.Scanner;

/**
 *
 * @author demet
 */
public class Soru4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.print("Kütle Giriniz: ");
        int ktl=input.nextInt();
   
        System.out.print("Hız Giriniz: ");
        int hız=input.nextInt();
        
        System.out.print("Yükseklik Giriniz: ");
        int yks=input.nextInt();
        int ptn= (ktl*hız*yks);
        int knt= (int) ((ktl*Math.pow(hız,2))/2);
        System.out.println("Potansiyel Enerji: "+ptn+", Kinetik Enerji: "+knt);
    }
    
}
