/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Microsoft
 */

class Hewan{
    private String nama;
    private String jenis;
    private int umur;
    
    //konstruktor
    public Hewan(String nama, String jenis, int umur){
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
    }
    
    // metode untuk mennampilkan informasi hewan
    public void tampilkanInfo(){
        System.out.println("nama:" + nama + ", jenis: " + jenis + ", umur:" + umur + "tahun");
    }
    
    //metode untuk menambah umur hewan
    public void bertambahUmur(int tahun){
        this.umur += tahun;
        System.out.println(nama + " telah bertambah umur menjadi" + umur +" tahun."); 
    }
//metode untuk menampilkan suara hewan
    public void suaraHewan() {
        if (nama.equalsIgnoreCase("Kucing")){
            System.out.println(nama + ": Meong!");
        } else if(nama.equalsIgnoreCase("Anjing")){
            System.out.println(nama + ": Guk guk!");
        } else {
            System.out.println(nama +": suara tidak diketahui.");
    }
}
}
public class latihan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // membuat objek hewan
        Hewan hewan1 = new Hewan("Kucing", "Mamalia", 3);
        Hewan hewan2 = new Hewan("Anjing", "Mamalia", 2);
        
        //menampilkan informasi awal
        hewan1.tampilkanInfo();
        hewan1.suaraHewan();
        hewan1.bertambahUmur(2); //menambah umur kucing
        hewan1.tampilkanInfo(); //menampilkan info setelah umur bertambah
        
        System.out.println(); //pemisah output
        
        hewan2.tampilkanInfo();
        hewan2.suaraHewan();
        hewan2.bertambahUmur(2); // menambah umur anjiing
        hewan2.tampilkanInfo(); //menampilkan info setelah umur bertambah
    }
}
