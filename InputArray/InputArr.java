package SchoolDuty;

import java.util.Scanner;

public class InputArr {
    public static void main(String[] args) {
        // Make scanner obj
        Scanner Input = new Scanner(System.in);
        
        // Variable
        int jmlMobil;
        
        // Input from user
        // Input jml mobil
        System.out.print("Masukkan Jumlah Mobil = ");
        jmlMobil = Input.nextInt();

        // Declare Array
        String[] cars = new String[jmlMobil];

        // Input mobil
        for(int i = 0; i < jmlMobil; i++) {
            System.out.print("Input Mobil ke-" + (i+1) + " = ");
            cars[i] = Input.next();
        }
        
        System.out.println();

        // Print Hasil
        System.out.println("----Hasil----");
        for(int a = 0; a < cars.length; a++) {
            System.out.println("Mobil ke-" + (a+1) + " = " + cars[a]);
        }

    }
}