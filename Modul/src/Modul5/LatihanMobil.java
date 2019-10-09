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
public class LatihanMobil extends LatihanKendaraan{
    private long harga;
    protected String namaClass = "LatihanMobil";
    
    protected void setHarga(String harga){
        this.harga = Long.parseLong(harga);
    }
    
    protected long getHarga(){
        return harga;
    }
    
    protected String keterangan(){
        return (namaClass+ " : ini adalah class "+namaClass);
    }
    
    public String keterangan_kendaraan(){
        return super.namaClass+" : "+super.keterangan();
    }
}
