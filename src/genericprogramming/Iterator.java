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
public class Iterator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> bilanganbulat = new ArrayList<>();
        
        bilanganbulat.add(10);
        bilanganbulat.add(20);
        bilanganbulat.add(30);
        bilanganbulat.add(40);
        bilanganbulat.add(50);
        
        java.util.Iterator<Integer> iterator = bilanganbulat.iterator();
        while (iterator.hasNext()){
            Object elemen = iterator.next();
            System.out.println(elemen);
        }
        
    }

    
    
}
