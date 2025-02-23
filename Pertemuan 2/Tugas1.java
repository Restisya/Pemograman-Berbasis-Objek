/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Microsoft
 */
class kendaraan {
    private String merk;
    private String tipe;
    private int kecepatan;
    
    //konstruktor
    public kendaraan (String merk, String tipe, int kecepatan){
        this.merk = merk ;
        this.tipe = tipe ;
        this.kecepatan = kecepatan ;
}
        
    // menampilkan semua informasi kendaraan
   public void tampilkanInfo(){
       System.out.println("merk:" + merk + ",tipe:" + tipe  + ",kecepatan:" + kecepatan + "km/jam");
   }
   // menambahkan kecepatan
   public void tambahkecepatan(int km){
       this.kecepatan += km;
       System.out.println(merk + " menambah kecepatan" + kecepatan + "km/jam.");
   }
   
   // mengurangi kecepatan
   public void kurangikecepatan(int km){
       this.kecepatan -= km;
       System.out.println(merk + " mengurangi kecepatan " + kecepatan + "km/jam.");
    }
       
       //berhenti
    public void berhenti(){
        this.kecepatan = 0;
        System.out.println("kendaraan berhenti.");
    }
}
   

public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // membuat objek kendaraan
        kendaraan kendaraan1 = new kendaraan("Toyota", "Mobil", 60);
        kendaraan kendaraan2 = new kendaraan("Yamaha", "Motor", 40);
        
        // menampilkan informasi
        kendaraan1.tampilkanInfo();
        kendaraan1.tambahkecepatan(20); // menambah kecepatan
        kendaraan1.kurangikecepatan(30); // mengurangi kecepatan
        kendaraan1.berhenti();
        kendaraan1.tampilkanInfo();
        
        System.out.println(); // pemisah output
       
        kendaraan2.tampilkanInfo();
        kendaraan2.tambahkecepatan(30); // menambah kecepatan
        kendaraan2.kurangikecepatan(40); // mengurangi kecepatan
        kendaraan2.berhenti();
        kendaraan2.tampilkanInfo();
        
    }
}
