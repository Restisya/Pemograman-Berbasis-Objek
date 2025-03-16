/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

interface Hewan{
    void makan();
}

interface Mamalia{
    void menyusui();
}

class Kucing implements Hewan,Mamalia{
    public void makan(){System.out.println("Kucing makan ikan.");}
    public void menyusui(){System.out.println("Kucing menyusui anaknya");}
}

public class latihan4 {
    public static void main(String args[]) {
        //membuat objek kucing
        Kucing Kucing = new Kucing();
        
        // memanggil metod yang dimilki oleh kucing
        Kucing.makan();
        Kucing.menyusui();
    }
}
