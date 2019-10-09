/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul5;
import javax.swing.*;
/**
 *
 * @author syafi
 */
public class LatihanMainMobil extends LatihanMobil{
    public static void main(String[] args) {
        LatihanMainMobil ob = new LatihanMainMobil();
        String merk, warna, harga;
        int jumlah;
        jumlah = Integer.parseInt((JOptionPane.showInputDialog("Masukan Jumlah Input : ")));
        ob.tampilfor(jumlah);
        merk = JOptionPane.showInputDialog("Merk Mobil : ");
        ob.setMerk(merk);
        ob.tampil("Merk mobil  : "+ob.getMerk());
        
        warna = JOptionPane.showInputDialog("warna Mobil : ");
        ob.setWarna(warna);
        ob.tampil("Warna Mobil : "+ob.getWarna());
        
        harga = JOptionPane.showInputDialog("Harga Mobil : ");
        ob.setHarga(harga);
        ob.tampil("Harga Mobil : "+ob.getHarga());
    }
}
