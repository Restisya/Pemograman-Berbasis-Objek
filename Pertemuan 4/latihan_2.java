/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

class Hewan{
    void makan(){
        System.out.println("Hewan sedang makan. ");}
}

class Kucing extends Hewan{
    void suara(){
        System.out.println("Meow!");}
}

class KucingAnggora extends Kucing{
      void jenis(){
        System.out.println("ini adalah kucing anggora. ");}
}

public class latihan_2 {
    public static void main(String args[]) {
        KucingAnggora anggora = new KucingAnggora();
        anggora.makan(); // dari superclass hewan
        anggora.suara(); // dari subclass kucing
        anggora.jenis(); //dari subclass kucing anggora
    }
}
