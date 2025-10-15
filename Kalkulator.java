/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

/**
 *
 * @author user-2
 */
public class Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        penjumlahan jumlah = new penjumlahan (5,10);
        pengurangan kurang = new pengurangan (10,5);
        pembagian bagi = new pembagian (10,5);
        perkalian kali = new perkalian (10,5);
        kuadrat kuadrat = new kuadrat (10);
        perakaran akar = new perakaran (10);
        
    }
    
    private static class penjumlahan {
        public penjumlahan (int a, int b){
        System.out.print("Hasil Dari Penjumlahan = ");
        
        int c;
        c = a+b;
        System.out.println(c);
        }
    }
    
    private static class pengurangan {
        public pengurangan (int a, int b) {
        System.out.print("Hasil Dari Pengurangan = ");
        
        int c;
        c = a-b;
        System.out.println(c);
        }
    }
    
     private static class pembagian {
        public pembagian (int a, int b) {
        System.out.print("Hasil Dari Pembagian = ");
        
        int c;
        c = a/b;
        System.out.println(c);
        }
    }
     
    private static class perkalian {
        public perkalian (int a, int b) {
        System.out.print("Hasil Dari Perkalian = ");
        
        int c;
        c = a*b;
        System.out.println(c);
        }
    }
          
     private static class kuadrat {
        public kuadrat (int a) {
        System.out.print("Hasil Dari Kuadrat = ");
        
        System.out.println(a*a);
    
        }
    }
     
    private static class perakaran {
        public perakaran (int a) {
        System.out.print("Hasil Dari Akar = ");
        
        double hasil = Math.sqrt(a);
        System.out.print(hasil);
    
        }
    }
    
    
}
