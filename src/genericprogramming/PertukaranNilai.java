/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericprogramming;

/**
 *
 * @author anggi
 */
public class PertukaranNilai<E> {

    private  E datasatu;
    private E datadua;
    private E temp;

    public E getDatasatu() {
        return datasatu;
    }

    public void setDatasatu(E datasatu) {
        this.datasatu = datasatu;
    }

    public E getDatadua() {
        return datadua;
    }

    public void setDatadua(E datadua) {
        this.datadua = datadua;
    }

    

    

//nilainya bisa tertukar karena disini diset nya 
    public void tukarNilai() {
        temp = datasatu;
        datasatu = datadua;
        datadua = temp;
    }
    
    public void tampilHasilTukar(){
        System.out.println("Nilai Variabel satu sesudah ditukar = "+datasatu);
        System.out.println("Nilai Variabel dua sesudah ditukar = "+datadua);
    } 
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PertukaranNilai<Integer> tukarinteger = new PertukaranNilai<>();
        tukarinteger.setDatasatu(200);
        tukarinteger.setDatadua(100);
        tukarinteger.tukarNilai();
        tukarinteger.tampilHasilTukar();
        
        
       PertukaranNilai<String> tukarstring = new PertukaranNilai<>();
        tukarstring.setDatasatu("Asma");
        tukarstring.setDatadua("Aldebaran");
        tukarstring.tukarNilai();
        tukarstring.tampilHasilTukar();
        
        
    }
    
}
