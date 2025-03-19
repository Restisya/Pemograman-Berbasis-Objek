/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

class Mahasiswa{
    private String nama;
    private int umur;
    
 // Constructor
public Mahasiswa(String nama, int umur){
    this.nama = nama;
    this.umur = umur;
}

//Getter
public String getNama(){
    return nama;
}

public int getUmur(){
    return umur;
}

//Setter
public void setNama(String nama){
    this.nama = nama;
}

public void setUmur(int umur){
    if(umur>0){ // validasi
        this.umur = umur;
    }else{
        System.out.println("Umur tidak valid!");
}
}
}

public class Latihan1 {
    public static void main(String args[]) {
        Mahasiswa mhs = new Mahasiswa("Adi",2);
    // Mengakses data melalui getter
    System.out.println("Nama:" + mhs.getNama());
    System.out.println("Umur:" + mhs.getUmur());
    
    // Mengubah data dengan setter
    mhs.setNama("Budi");
    mhs.setUmur(25);
    
    System.out.println("Nama Baru:" + mhs.getNama());
    System.out.println("Umur:" + mhs.getUmur());
    
    }
}
