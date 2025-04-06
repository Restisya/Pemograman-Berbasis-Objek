/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

import java.util.Random;
import java.util.Scanner;

// Kelas permainan
class Permainan {
    private int angkaRahasia;
    private int percobaan;

    public Permainan() {
        mulaiLagi(); // Memulai permainan pertama kali
    }

    public void mulaiLagi() {
        Random random = new Random();
        angkaRahasia = random.nextInt(100) + 1; // Angka acak antara 1 - 100
        percobaan = 0;
    }

    public boolean cekTebakan(int tebakan) {
        percobaan++;

        if (tebakan < angkaRahasia) {
            System.out.println("Terlalu kecil! Coba lagi.");
            return false;
        } else if (tebakan > angkaRahasia) {
            System.out.println("Terlalu besar! Coba lagi.");
            return false;
        } else {
            return true; // Tebakan benar
        }
    }

    public int getPercobaan() {
        return percobaan;
    }
}

public class TebakAngka {
    public static void main(String args[]) {
         Scanner scanner = new Scanner(System.in);
        Permainan permainan = new Permainan(); // Membuat objek permainan
        boolean bermain = true;

        System.out.println("=== Selamat Datang di Permainan Tebak Angka! ===");
        System.out.println("Tebak angka antara 1 hingga 100 (Ketik 0 untuk keluar)");

        while (bermain) {
            System.out.print("Masukkan tebakan Anda: ");
            int tebakan = scanner.nextInt();

            if (tebakan == 0) {
                System.out.println("Terima kasih telah bermain!");
                break; // Keluar dari permainan
            }

            // Memeriksa tebakan
            boolean benar = permainan.cekTebakan(tebakan);

            if (benar) {
                System.out.println("Selamat! Anda menebak angka dengan benar dalam " + permainan.getPercobaan() + " percobaan.");
                System.out.print("Ingin bermain lagi? (y/n): ");
                char pilihan = scanner.next().charAt(0);

                if (pilihan == 'y' || pilihan == 'Y') {
                    permainan.mulaiLagi(); // Memulai permainan baru
                } else {
                    System.out.println("Terima kasih telah bermain!");
                    bermain = false;
                }
            }
        }
        scanner.close();
    }
}
  

