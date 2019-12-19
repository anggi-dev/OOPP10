/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericprogramming;

import java.util.PriorityQueue;



/**
 *
 * @author anggi
 */
public class Priorityqueue {

//    catatan : supaya tidak error pastikan nama kelas dan nama priorityqueue tidak sama
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    PriorityQueue<String> nama = new PriorityQueue<>();
        
//  coba operasi offer
    nama.offer("Dodi");
    nama.offer("Silvi");
    nama.offer("Keke");
    nama.offer("Queen");
    
//  coba operasi peek
        System.out.println(nama.peek());
        
//  untuk membuktikan bahwa nama yang di peek tidak hilang
    System.out.println("\nList nama setelah operasi peek");    
    System.out.println("==============================");
    for (String name : nama){
        System.out.println(name);
    }
    
//   coba operasi poll
        System.out.println(nama.poll());
        
//   untuk membuktikan bahwa nama yang di poll tidak hilang
        System.out.println("\nList nama setelah operasi poll");
        System.out.println("==================================");
        for (String name : nama){
        System.out.println(name);
    }
        
    }
    
}
