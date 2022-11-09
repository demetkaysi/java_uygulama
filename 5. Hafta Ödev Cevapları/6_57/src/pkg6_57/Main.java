/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6_57;

import java.util.Scanner;

/**
 *
 * @author demet
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
     System.out.print("Pozitif TamsayıGiriniz : ");
     int s=input.nextInt();
     System.out.println("\na-b ");
     System.out.println("=====");
     for(int a=0; a<=s; a++){
         for (int b = 0; b < s; b++)
         if(a*b+b==s)
             System.out.println(a+"-"+b);
         
             
         }
    }
    
}
