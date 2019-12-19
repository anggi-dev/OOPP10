/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericprogramming;

import java.util.ArrayList;

/**
 *
 * @author anggi
 */
public class Arraylist {
 private static Object nama;

 //    catatan : supaya tidak error pastikan nama kelas dan nama arraylist tidak sama
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        coba operasi add
        ArrayList<String> nama = new ArrayList<>();
        nama.add("Ani");
        nama.add("Budi");
        nama.add("Elsa");
        nama.add("Herti");
        
//        menyisipkan nama zaenal diposisi ke 3
        nama.add(2,"Zaenal");
        System.out.println("List nama setelah disisipkan nama Zaelani");
        System.out.println("==============================");
        for (String name : nama){
            System.out.println(name);
        }
     
//        coba operasi get
//        mendapatkan nama Elsa

        System.out.println("\nHASIL OPERASI get UNTUK NAMA DIPOSISI "+"keempat");
        System.out.println("======================================");
        System.out.println(nama.get(3));
        
        
//        coba operasi remove
        nama.remove(0);
        System.out.println("\nList Nama setelah nama pertama dihapus");
        System.out.println("----------------------------------------");
        for (String name : nama){
            System.out.println(name);
        }
        
//        coba operasi size
        System.out.println("\nUkuran ARRAY LIST"+nama.size());
        
        
    }

    
    
}
