/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ödev3;

import java.util.Scanner;

/**
 *
 * @author demet
 */
public class Ödev3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int a;
        int b;
        int c;
	System.out.println("Kenar Uzunluğu Giriniz:");
        a = input.nextInt(); 
        System.out.println("Kenar Uzunluğu Giriniz:");
        b = input.nextInt(); 
        System.out.println("Kenar Uzunluğu Giriniz:");
        c = input.nextInt(); 
        if(a==b&&b==c)
            System.out.println("Eşkenar Üçgen");
            
        
else if((a==b&&b!=c)||(a!=c&&c==b)||(a==c&&c!=b))
     System.out.println("İkizkenar Üçgen");

else if(a!=b&&b!=c)
     System.out.println("Çeşitkenar Üçgen");
    
}
}