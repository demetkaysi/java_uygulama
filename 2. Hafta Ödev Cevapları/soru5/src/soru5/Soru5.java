/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru5;

import java.util.Scanner;

/**
 *
 * @author demet
 */
public class Soru5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.print("Direnç Giriniz: ");
        int direnc=input.nextInt();
   
        System.out.print("Akım Giriniz: ");
        int akim=input.nextInt();
        int grl= (direnc*akim);
        System.out.println("Gerilim:"+grl);
    }
    
}
