/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

//Kelas induk(superclass)
class Hewan{
    String nama;
   
 void makan(){
     System.out.println(nama + " sedang makan ");
 }
}

//kelas anak(subclass) yang mewarisi dari hewan
class Kucing extends Hewan{
    void suara(){
      System.out.println(nama + " mengeong: Meow! ");
    }
}

public class latihan_1 {
    public static void main(String args[]) {
        Kucing Kucing1 = new Kucing();
        Kucing1.nama = " Tom ";
        Kucing1.makan(); // memanggil metode dari supperclass
        Kucing1.suara(); // memanggil metode dari subclass
    }
}
