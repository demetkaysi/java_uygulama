/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ödev2;

import java.util.Scanner;

/**
 *
 * @author demet
 */
public class Ödev2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
         System.out.println("1-7 arasında sayı giriniz: ");
        int sec=input.nextByte();
        switch(sec){
            case 1:{System.out.println("Pazartesi"); break;}
            case 2:{System.out.println("Salı"); break;}
            case 3:{System.out.println("Çarşamba"); break;}
            case 4:{System.out.println("Perşembe"); break;}
            case 5:{System.out.println("Cuma"); break;}
            case 6:{System.out.println("Cumartesi"); break;}
            case 7:{System.out.println("Pazar"); break;}
            default:{System.out.println("Yanlış değer girdiniz"); break;}
    

        }
    }
}