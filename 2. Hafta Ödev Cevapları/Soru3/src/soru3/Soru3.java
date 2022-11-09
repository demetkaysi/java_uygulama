/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru3;

import java.util.Scanner;

/**
 *
 * @author demet
 */
public class Soru3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
       final double PI =3.14;
        System.out.print("Kürenin Yarı Çapını (r) Giriniz : ");
        double r= input.nextDouble();
        double alan=4*PI*Math.pow(r, 2);
        double hacim=(4/3)*PI*Math.pow(r, 3);
        System.out.println("Alan : "+alan);
        System.out.println("Hacim : "+hacim);
    }
    
}
