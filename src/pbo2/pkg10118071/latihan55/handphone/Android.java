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
public class Android extends Handphone {
    private String keystore;

    public Android(String man, String os, String model, int harga) {
        super(man, os, model, harga);
    }
    
    public String getKeyStore() {
        return keystore;
    }
    
    public void setKeyStore(String keystore) {
        this.keystore = keystore;
    }
}
