/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

class Kalkulator{
    int tambah(int a, int b){
        return a +  b;  
    }
//(Overloading)
        int tambah(int a, int b, int c){
            return a+b+c;
        }
//(Overloading)
        double tambah(double a, double b){
            return a + b;
        }
}
public class latihan6 {
    public static void main(String args[]) {
        Kalkulator k = new Kalkulator();
        
        System.out.println(k.tambah(5, 10));
         System.out.println(k.tambah(5, 10, 15));
          System.out.println(k.tambah(5.5, 2.5));
        
    }
}
