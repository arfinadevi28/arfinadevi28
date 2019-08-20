package praktikum1;

import java.util.Scanner;

public class KonverensiSuhu {
    
    public static void main(String[] args) {
        // deklarasi
        Double fahrenheit;
        int celcius;
        
        // membuat scanner baru
        Scanner baca = new Scanner(System.in);
        
        // input
        System.out.println("Suhu Celcius ke Fahrenhait");
        System.out.print("Celcius: ");
        celcius = baca.nextInt();
   
        // proses
        fahrenheit = Double.valueOf((9 * celcius / 5) + 32);
        
        // Output      
        System.out.println("F: " + fahrenheit);
                    }
}