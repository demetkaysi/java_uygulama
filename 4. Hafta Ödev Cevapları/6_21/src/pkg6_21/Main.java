/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6_21;

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
        System.out.println("Sayıyı giriniz: ");
        int a=input.nextInt();
        for (int i = 1; i <= a; i++) {
            if (a%i==0) {
                System.out.println(i);
            }
        }
    }
    
}
