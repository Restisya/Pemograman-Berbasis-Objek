/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

//superclass
class Hewan{
    void bersuara(){
        System.out.println("Hewan bersuara....");
    }
}

//subclass
class Kucing extends Hewan{
    @Override
    void bersuara(){
        System.out.println("Meow! Meow!");
    }
}

class Anjing extends Hewan{
    @Override
    void bersuara(){
        System.out.println("Guk! Guk!");
    }
}

public class latihan7 {
    public static void main(String args[]) {
        Hewan hewan1 = new Kucing(); // polimorfisme
        Hewan hewan2 = new Anjing(); // polismorisme
        
        hewan1.bersuara(); // memanggil metode bersuara 
        hewan2.bersuara(); // memanggil metode bersuara
    }
}
