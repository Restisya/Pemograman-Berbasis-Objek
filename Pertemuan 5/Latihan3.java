/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

class BankAccount{
    private double saldo; // tidak bisa diakses langsung
    public BankAccount(double saldoAwal){
        this.saldo = saldoAwal;
    }
// getter
public double getSaldo(){
    return saldo;
}

//setter dengan validasi
public void setSaldo(double jumlah){
    if(jumlah >=0){
        this.saldo = jumlah;
    }else{
        System.out.println("Saldo tidak bisa negatif!");
 }
}
}

public class Latihan3 {
    public static void main(String args[]) {
        // Membuat objek BankAccount dengan saldo awal 1000
        BankAccount rekening = new BankAccount(1000);
        
        // Menampilkan saldo awal
        System.out.println("Saldo awal: " + rekening.getSaldo());
        
        // Menambahkan saldo
        rekening.setSaldo(2000);
        System.out.println("Saldo setelah perubahan: " + rekening.getSaldo());
        
        // Mencoba memasukkan saldo negatif
        rekening.setSaldo(-500);
        
        // Menampilkan saldo akhir
        System.out.println("Saldo akhir: " + rekening.getSaldo());
    }
}
