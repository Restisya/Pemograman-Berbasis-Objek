/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

import java.util.Scanner;

class Operasi {
    public static double hitung(double angka1, double angka2, char operator) {
        switch (operator) {
            case '+':
                return angka1 + angka2;
            case '-':
                return angka1 - angka2;
            case '*':
                return angka1 * angka2;
            case '/':
                if (angka2 != 0) {
                    return angka1 / angka2;
                } else {
                    System.out.println("Error: Tidak bisa membagi dengan nol.");
                    return Double.NaN; // Mengembalikan NaN untuk error
                }
            case '%':
                if (angka2 != 0) {
                    return angka1 % angka2;
                } else {
                    System.out.println("Error: Tidak bisa modulus dengan nol.");
                    return Double.NaN;
                }
            default:
                System.out.println("Error: Operator tidak valid!");
                return Double.NaN;
        }
    }
}

public class KalkulatorSederhana {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        char pilihan;

        do {
            // Meminta input angka pertama
            System.out.print("Masukkan angka pertama: ");
            double angka1 = scanner.nextDouble();

            // Meminta input operator
            System.out.print("Masukkan operator (+, -, *, /, %): ");
            char operator = scanner.next().charAt(0);

            // Meminta input angka kedua
            System.out.print("Masukkan angka kedua: ");
            double angka2 = scanner.nextDouble();

            // Menggunakan class Operasi untuk perhitungan
            double hasil = Operasi.hitung(angka1, angka2, operator);

            // Menampilkan hasil jika bukan NaN (kesalahan)
            if (!Double.isNaN(hasil)) {
                System.out.println("Hasil: " + angka1 + " " + operator + " " + angka2 + " = " + hasil);
            }

            // Menanyakan apakah ingin menghitung lagi
            System.out.print("Apakah ingin menghitung lagi? (y/n): ");
            pilihan = scanner.next().charAt(0);

        } while (pilihan == 'y' || pilihan == 'Y');

        System.out.println("Terima kasih telah menggunakan kalkulator!");
        scanner.close();
    }
}
       
 
