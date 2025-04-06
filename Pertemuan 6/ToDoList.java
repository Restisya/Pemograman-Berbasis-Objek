/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

import java.util.ArrayList;
import java.util.Scanner;

// Kelas untuk mengelola daftar tugas
class TaskManager {
    private ArrayList<String> daftarTugas;

    public TaskManager() {
        daftarTugas = new ArrayList<>();
    }

    public void tambahTugas(String tugas) {
        daftarTugas.add(tugas);
        System.out.println("Tugas berhasil ditambahkan!");
    }

    public void tampilkanTugas() {
        if (daftarTugas.isEmpty()) {
            System.out.println("Belum ada tugas dalam daftar.");
        } else {
            System.out.println("\n=== Daftar Tugas ===");
            for (int i = 0; i < daftarTugas.size(); i++) {
                System.out.println((i + 1) + ". " + daftarTugas.get(i));
            }
        }
    }

    public void hapusTugas(int indeks) {
        if (indeks > 0 && indeks <= daftarTugas.size()) {
            daftarTugas.remove(indeks - 1);
            System.out.println("Tugas berhasil dihapus!");
        } else {
            System.out.println("Nomor tugas tidak valid!");
        }
    }
}

public class ToDoList {
    public static void main(String args[]) {
            Scanner scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager(); // Membuat objek manajer tugas
        boolean running = true;

        while (running) {
            // Menampilkan menu
            System.out.println("\n=== MENU TO-DO LIST ===");
            System.out.println("1. Tambah Tugas");
            System.out.println("2. Lihat Semua Tugas");
            System.out.println("3. Hapus Tugas");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama tugas: ");
                    String tugas = scanner.nextLine();
                    taskManager.tambahTugas(tugas);
                    break;
                case 2:
                    taskManager.tampilkanTugas();
                    break;
                case 3:
                    taskManager.tampilkanTugas();
                    System.out.print("Masukkan nomor tugas yang akan dihapus: ");
                    int indeks = scanner.nextInt();
                    taskManager.hapusTugas(indeks);
                    break;
                case 4:
                    System.out.println("Terima kasih! Program selesai.");
                    running = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan coba lagi.");
            }
        }
        scanner.close();
    }
}
    

