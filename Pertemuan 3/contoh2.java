/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Microsoft
 */
//Interface
interface Hewan{
    void bersuara();
}

//Implementasi pada kelas kucing
class Kucing implements Hewan{
@Override
public void bersuara(){
    System.out.println("Kucing mengeong: Meow Meow!");
}
}

//implementasi pada kelas anjing
class Anjing implements Hewan{
@Override
public void bersuara(){
    System.out.println("Anjing menggonggong: Woof Woof!");
}
}
public class contoh2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Hewan kucing = new Kucing();
        Hewan anjing = new Anjing();
        
        kucing.bersuara();
        anjing.bersuara();
    }
}
