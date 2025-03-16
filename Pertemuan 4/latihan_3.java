/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

class Hewan{
    void makan()
    { System.out.println("Hewan sedang makan.");}
}

class Kucing extends Hewan{
    void suara()
    {System.out.println(" Kucing Meow!");}
}

class Anjing extends Hewan{
    void suara()
    {System.out.println(" Anjing Guk Guk1");}
}

public class latihan_3 {
    public static void main(String args[]) {
        // membuat objek kucing
        System.out.println("Objek Kucing");
        Kucing Kucing = new Kucing();
        Kucing.makan();
        Kucing.suara();
        
     System.out.println();
     
        // membuat objek anjing
        System.out.println("objek anjing");
        Anjing Anjing = new Anjing();
        Anjing.makan();
        Anjing.suara();
    }
}
