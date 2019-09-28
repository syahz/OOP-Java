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
public class LatihanMain {
   public static void main(String[] args) {
        Latihan ob = new Latihan();
        ob.setNama("Bolpoint");
        ob.setStok(10);
        ob.setHargaSatuan(2000);
        ob.tampil("Barang 1 : ");
        ob.tampil(ob.getNama(), ob.getStok(), ob.getHargaSatuan());
        ob.setHargaBarang(ob.getHargaSatuan(), ob.getStok());
        ob.tampil("Harga total Bolpoint ", ob.getHargaBarang());
        ob.setHargatotalall();
        
        ob.setNama("Pensil");
        ob.setStok(10);
        ob.setHargaSatuan(1000);
        ob.tampil("Barang 2 : ");
        ob.tampil(ob.getNama(), ob.getStok(), ob.getHargaSatuan());
        ob.setHargaBarang(ob.getHargaSatuan(), ob.getStok());
        ob.tampil("Harga total Pensil ", ob.getHargaBarang());
        ob.setHargatotalall();
        
        ob.setNama("Penghapus");
        ob.setStok(10);
        ob.setHargaSatuan(500);
        ob.tampil("Barang 3 : ");
        ob.tampil(ob.getNama(), ob.getStok(), ob.getHargaSatuan());
        ob.setHargaBarang(ob.getHargaSatuan(), ob.getStok());
        ob.tampil("Harga total Pensil ", ob.getHargaBarang());
        ob.setHargatotalall();
        ob.tampil("Total Harga Keseluruhan ", ob.getHargatotalall());
        
        
    }
}
