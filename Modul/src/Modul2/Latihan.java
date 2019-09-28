/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2;

/**
 *
 * @author syafi
 */
public class Latihan {
    private String nama;
    private int stok;
    private int hargaSatuan;
    private int hargabarang;
    private int hargatotalall;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getHargaSatuan() {
        return hargaSatuan;
    }

    public void setHargaSatuan(int hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
    }
    
    public void tampil(String a, int data){
        System.out.print(a);
        System.out.println(data);
    }
    public void tampil(String a){
        System.out.println();
        System.out.println(a);
    }
    public void tampil(String a, int b, int c){
        System.out.println("Nama Barang \t: "+a);
        System.out.println("Jumlah Stok \t: "+b);
        System.out.println("Harga Satuan \t: "+c);
    }
    public int getHargaBarang() {
        return hargabarang;
    }

    public void setHargaBarang(int hargSatuan, int stok) {
        hargabarang = (int)(hargSatuan * stok);
    }
    
    public void setHargatotalall(){
        hargatotalall += hargabarang;
    }
    public int getHargatotalall(){
        return hargatotalall;
    }
    
}