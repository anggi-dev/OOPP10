/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericprogramming;

import java.util.Stack;

/**
 *
 * @author anggi
 */
public class stack {

    //    catatan : supaya tidak error pastikan nama kelas dan nama stack tidak sama
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Stack<String> nama = new Stack<>();
       
//       coba operasi push
    nama.push("Adam");
    nama.push("Rio");
    nama.push("Iva");
    nama.push("Ido");
    
//  coba operasi pop
        System.out.println(nama.pop()); //mengambil Ido
        System.out.println(nama.pop()); //mengambil Iva
       
       
    }
    
}
