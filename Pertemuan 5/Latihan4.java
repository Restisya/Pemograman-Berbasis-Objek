/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

class Mesin {
    private void cekBahanBakar(){
        System.out.println("Cek bahan bakar sebelum menyalakan mesin...");
    }

public void NyalakanMesin(){
    cekBahanBakar(); //bisa dipanggil di dalam kelass
    System.out.println("Mesin Menyala!");
}
}

public class Latihan4 {
    public static void main(String args[]) {
       Mesin Mobil = new Mesin();
       Mobil.NyalakanMesin();
       // Mobil.cekBahanBakar(); // error cekBahanBakar() bersifat private
}
}
