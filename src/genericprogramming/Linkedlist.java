/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericprogramming;

import java.util.LinkedList;

/**
 *
 * @author anggi
 */
public class Linkedlist {

    //    catatan : supaya tidak error pastikan nama kelas dan nama Linkedlist tidak sama
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    LinkedList<String> nama = new LinkedList<>();
        
//  coba operasi addFirst dan addLast
    nama.addFirst("Elsa");
    nama.addFirst("Zaenal");
    nama.addFirst("Herti");
    nama.addFirst("Vano");
    
        System.out.println("List nama setelah addFirst dan addLast");
        System.out.println("========================================");
        for (String name : nama){
            System.out.println(name);
        }
        
//        coba getFirst dan RemoveLast
        nama.removeFirst(); //menghapus Zaenal
        nama.removeLast(); //menghapus vano
        
        System.out.println("\nList nama setelah addFirst dan addLast");
        System.out.println("=========================================");
         for (String name : nama){
            System.out.println(name);
        }
        
    }
    
}
