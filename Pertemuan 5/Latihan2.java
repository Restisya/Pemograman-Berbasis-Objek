/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

class Mahasiswa{
    private String nama; // tidak bisa diakses langsung diluar kelas
 
// Constructor
public Mahasiswa(String nama){
    this.nama = nama;
}

//getter untuk mengakses nama
public String getNama(){
    return nama;
}
}


public class Latihan2 {
    public static void main(String args[]) {
        Mahasiswa mhs = new Mahasiswa("Adi");
    // System.out.println(mhs.nama); // error nama bersifat private
    System.out.println(mhs.getNama()); // akses melalui metode getter
    }
}
