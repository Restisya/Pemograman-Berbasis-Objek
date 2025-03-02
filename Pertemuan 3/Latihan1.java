/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Microsoft
 */
abstract class Kendaraan{
    String nama;
    int jumlahRoda;
    
public Kendaraan(String nama, int jumlahRoda){
    this.nama = nama;
    this.jumlahRoda = jumlahRoda;
}

//Method abstract yang harus diimplementasikan oleh subclass
abstract void bergerak();

public void info(){
    System.out.println(nama + " memiliki "  +  jumlahRoda  +  " roda. ");
}
}

//subclass Mobil
class Mobil extends Kendaraan{
public Mobil(String nama){
    super(nama,4);
}

@Override
void bergerak(){
System.out.println(nama + " bergerak dengan mesin bensin.");
}
}

//subclass Sepeda motor
class SepedaMotor extends Kendaraan{
public SepedaMotor(String nama){
    super(nama,2);
}

@Override
void bergerak(){
    System.out.println(nama +  " bergerak dengan mesin bensin.");
}
}

class AbstractClassDemo{
    public static void main(String[] args){
        System.out.println("output abstract class");

        Kendaraan mobil = new Mobil("Toyota");
        Kendaraan motor = new SepedaMotor("Honda");

        mobil.info();
        mobil.bergerak();

        motor.info();
        motor.bergerak();
        
      System.out.println();
    }
}


//Interface kendaran listrik
interface KendaraanListrik{
    void isiDaya();
}

//subclass MobilListrik yag merupakan mobil dan juga kendaraan lisstrik
class MobilListrik extends Mobil implements KendaraanListrik{
public MobilListrik(String nama){
super(nama);
}

@Override
void bergerak(){
System.out.println(nama + " bergerak dengan motor listrik.");
}

@Override
public void isiDaya(){
    System.out.println(nama + " sedang diisi daya.");
}
}

public class Latihan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // menjalankan AbstractClassDemo
        AbstractClassDemo.main(args);
        System.out.println("output Aplikasi dengan Interface");
        
        //menjalankan program
    MobilListrik tesla = new MobilListrik("Tesla Model 3");
    
    tesla.info();
    tesla.bergerak();
    
    tesla.isiDaya();
            
    }
}
