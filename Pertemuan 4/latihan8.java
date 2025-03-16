/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

interface Kendaraan{
    void berjalan();
}

//implementasi pertama
class Mobil implements Kendaraan{
        public void berjalan(){
            System.out.println("Mobil berjalan dengan 4 roda.");
          } 
 }
    
    // implementasi kedua
class Motor implements Kendaraan{
    public void berjalan(){
        System.out.println("Montor berjalan dengan 2 roda.");
    }
}

public class latihan8 {
    public static void main(String args[]) {
        Kendaraan kendaraan1 = new Mobil();
        Kendaraan kendaraan2 = new Motor();
        
        kendaraan1.berjalan();
        kendaraan2.berjalan();
    }
}
