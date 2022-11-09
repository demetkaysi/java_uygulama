/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ödev1;

import java.util.Scanner;

/**
 *
 * @author demet
 */
public class Ödev1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
        int sayi;
	System.out.println("Sayı giriniz:");
        sayi = input.nextInt(); 
	  if(sayi>0)
	    System.out.println("Girilen sayı pozitiftir");	
 
          else if (sayi<0)
	    System.out.println("Girilen sayı negatiftir");
          else
              System.out.println("Girilen sayı 0'a eşittir");
          
}

    }
    

