/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ödev4;

import java.util.Scanner;

/**
 *
 * @author demet
 */
public class Ödev4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("N Sayısını giriniz: ");
        int n=input.nextInt();
        int toplam=0;
        for (int i = 0; i <= n; i++) {
            if (i%2==1) {
                toplam+=i;
            }
        }
        System.out.println(toplam);
    }
    
}
