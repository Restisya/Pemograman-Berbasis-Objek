/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Microsoft
 */
abstract class Kendaraan {
    String nama;
    
 // Konstruktor
    public Kendaraan(String nama){
        this.nama = nama;
    }
    
 //Method abstrak
    abstract void bergerak();
 //Method konkret
    public void info(){
        System.out.println(nama + " adalah kendaraan.");
  }
}

//Subclass yang mengimplementasikan method abstrak

class Mobil extends Kendaraan{
   public Mobil(String nama){
    super(nama);
}
 
//Implementasi method abstrak
@Override
void bergerak(){
System.out.println(nama  +  " bergerak dengan roda.");
}
}

class Kapal extends Kendaraan{
public Kapal(String nama){
    super(nama);
}

//Implementasi method abstrak
@Override
void bergerak(){
    System.out.println(nama  + " bergerak di air.");
}
}

// Main class untuk menjalankan program
public class contoh1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // membuat objek mobil dan kapal
        
        Kendaraan mobil = new Mobil("Toyota");
        Kendaraan kapal = new Kapal("Titanic");
                
            mobil.info();
            mobil.bergerak();
            
            kapal.info();
            kapal.bergerak();
    }
}
