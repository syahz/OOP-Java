/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul5;

/**
 *
 * @author syafi
 */
public class LatihanKendaraan {
    private String merk, warna;
    protected String namaClass = "LatihanKendaraan";
    
    protected void setMerk(String merk){
        this.merk = merk;        
    }
    
    protected String getMerk(){
        return merk;
    }
    
    protected void setWarna(String warna){
        this.warna = warna;
    }
    protected String getWarna(){
        return warna;
    }
    protected void tampil(String a){
        System.out.println(a);
    }
    
    protected void tampilfor(int a){
        for (int i = 0; i < a; i++) {
            System.out.println(a);
        }
    }
    
    protected String keterangan(){
        return ("ini adalah class "+namaClass);
    }
}
