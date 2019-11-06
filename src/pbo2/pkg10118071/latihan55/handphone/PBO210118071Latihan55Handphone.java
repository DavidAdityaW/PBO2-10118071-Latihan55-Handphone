/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118071.latihan55.handphone;

/**
 *
 * @author 
 * NAMA              : David Aditya Winarto
 * KELAS             : PBO2
 * NIM               : 10118071
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 *                     manufaktur, os, model, dan harga handphone
 * 
 */
public class PBO210118071Latihan55Handphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Android an = new Android("Samsung", "Android", "Grand", 3000000);
        Blackberry bb = new Blackberry("BlackB", "RIM", "Curve", 2000000);
        WindowsPhone wp = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000);
        
        an.setKeyStore("234ibfd3840fo");
        bb.setPinBB("BHS249");
        wp.setWpKeyStore("UUUQIJWORJ");
        
        an.displayProduct();
        System.out.println("Android Key Store : " + an.getKeyStore() + "\n");
        bb.displayProduct();
        System.out.println("PIN : " + bb.getPinBB() + "\n");
        wp.displayProduct();
        System.out.println("Wp Key Store : " + wp.getWpKeyStore());
    }
    
}
