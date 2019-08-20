
package praktikum1;

/**
 *
 * 
 */

import java.util.Scanner;

public class LuasSegitiga {
    
    public static void main(String[] args){
        // deklarasi
        Double luas;
        int alas, tinggi;
        
        // membuat scanner baru
        Scanner baca = new Scanner(System.in);
        
        // input
        System.out.println("== program hitung luas Segitiga ==");
        System.out.print("Input alas: ");
        alas = baca.nextInt();
        System.out.print("Input tinggi: ");
        tinggi = baca.nextInt();
        
        // proses
        luas = Double.valueOf((alas * tinggi) / 2);
        
        // output
        System.out.println("Luas = " + luas);
        
    }
}
       
        
    
