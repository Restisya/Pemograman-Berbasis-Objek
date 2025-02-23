/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Microsoft
 */
class Mahasiswa {
 private String nama;
 private int nim;
 
 // konstruktor
 public Mahasiswa(String nama, int nim){
     this.nama = nama;
     this.nim = nim;
 
 }

 //Metode
 public void tampilkanInfo(){
     System.out.println("nama:" + nama + ",nim:" + nim);
 }
}
        
public class class1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Mahasiswa mhs1 = new Mahasiswa("Budi", 220001);
        Mahasiswa mhs2 = new Mahasiswa("Siti", 220002);
        
        //menampilkan informasi mahasiswa
        mhs1.tampilkanInfo();
        mhs2.tampilkanInfo();
        
    }
}
