/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

class Hewan{
    String nama;
Hewan(String nama){
    this.nama = nama;
}
void info(){
    System.out.println("Nama: " + nama);
}
}

class Kucing extends Hewan{
    Kucing(String nama){
        super(nama);//memanggil konstruktor superclass
    }
}
public class latihan5 {
    public static void main(String args[]) {
        Kucing Kucing = new Kucing("milo");
        
        // memanggil metod info dari superclass hewan
        Kucing.info();
    }
}
