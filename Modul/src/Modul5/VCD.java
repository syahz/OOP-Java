/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul5;

import javax.swing.JOptionPane;

/**
 *
 * @author syafi
 */
public class VCD extends rental{
    void inputData(){
        String judul, stock, aktor, sutradara, publisher, kategori, input;
            
            judul = JOptionPane.showInputDialog(null,
                    "Masukan Judul",
                    "Masukan ke ",
                    JOptionPane.INFORMATION_MESSAGE);
            
            stock = JOptionPane.showInputDialog(null,
                    "Masukan stock",
                    "Nama",
                    JOptionPane.INFORMATION_MESSAGE);
            
            aktor = JOptionPane.showInputDialog(null,
                    "Masukan aktor",
                    "Nama",
                    JOptionPane.INFORMATION_MESSAGE);
            
            sutradara = JOptionPane.showInputDialog(null,
                    "Masukan sutradara",
                    "Nama",
                    JOptionPane.INFORMATION_MESSAGE);
            
            publisher = JOptionPane.showInputDialog(null,
                    "Masukan publisher",
                    "Nama",
                    JOptionPane.INFORMATION_MESSAGE);
            
            kategori = JOptionPane.showInputDialog(null,
                    "Masukan kategori",
                    "Nama",
                    JOptionPane.INFORMATION_MESSAGE);
            setSemua(judul, stock, aktor, sutradara, publisher, kategori);
            
            input = JOptionPane.showInputDialog(null,
                    "Apakah Anda ingin menginputkan lagi? Jika Iya Y jika tidak T");
            
        if (input.equals("Y")) {
            tampil();
            inputData();
        }else{
            tampil();
            System.exit(0);
            
        }
    }
    
    protected void tampil(){
        System.out.println("Nama Judul "+getJudul());
        System.out.println("Nama Aktor "+getAktor());
        System.out.println("Nama sutradara "+getSutradara());
        System.out.println("nama Publisher "+getPublisher());
        System.out.println("Kategori Film "+getKategori());
        System.out.println("Jumlah Stock "+getStock());
        System.out.println("");
    }
}
