/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru1;

import java.util.Scanner;

/**
 *
 * @author demet
 */
public class Soru1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Kenar uzunluğunu giriniz: ");
        double kenar=input.nextDouble();
        System.out.println("Yüksekliği giriniz:");
        double yuk=input.nextDouble();
        double alan=yuk*kenar/2;
        System.out.println(alan);
    }
    
}
