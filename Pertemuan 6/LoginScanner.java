/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

import java.util.Scanner;

class Login{
    private String correctUsername = "Jhon Mayer";
    private String correctPassword = "amerika1977";
    private int maxAttempts = 3;

    public void login() {
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        boolean isLoggedIn = false;

        while (attempts < maxAttempts) {
            System.out.print("Masukkan username: ");
            String username = scanner.nextLine();

            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Selamat datang, " + username + "!");
                isLoggedIn = true;
                break;
            } else {
                attempts++;
                System.out.println("Username atau password salah. Percobaan ke" + attempts+ "/" + maxAttempts);
            }
        }

        if (!isLoggedIn) {
            System.out.println("Akun diblokir!");
        }

        scanner.close();
    }
}

public class LoginScanner {
    public static void main(String args[]) {
        Login login  = new Login(); // Membuat objek LoginSystem
        login.login(); // Memanggil method login()
    }
}
        
  
