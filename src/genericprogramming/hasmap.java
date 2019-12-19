/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericprogramming;

import java.util.HashMap;

/**
 *
 * @author anggi
 */
public class hasmap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String, String> provinsi = new  HashMap<>();
        
//      coba operasi put
        provinsi.put("Jawa Barat", "Bandung");
        provinsi.put("Jawa Tengah", "Semarang");
        provinsi.put("Jawa Timur", "Surabaya");
        
//      coba operasi get
        System.out.println(provinsi.get("Jawa Barat"));
        
//      coba operasi constainsKey dan constainsValue
        System.out.println(provinsi.containsKey("Sumatera Barat")); //true
        System.out.println(provinsi.containsValue("Semarang")); //false
    }
    
}
