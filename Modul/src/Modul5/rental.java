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
public class rental {
    private String judul, stock, aktor, sutradara, publisher, kategori;
    
    protected void setSemua(String judul, String stock, String aktor, String sutradara, String publisher, String kategori){
        this.judul = judul;
        this.stock = stock;
        this.aktor = aktor;
        this.sutradara = sutradara;
        this.publisher = publisher;
        setKategori(kategori);
    }
    
    protected void setKategori(String Kategori){
        if (Kategori.equalsIgnoreCase("SU")) {
            Kategori = "Semua Umur";
        }else if (Kategori.equalsIgnoreCase("D")) {
            Kategori = "Dewasa";
        }else if (Kategori.equalsIgnoreCase("R")) {
            Kategori = "Remaja";
        }else if (Kategori.equalsIgnoreCase("A")) {
            Kategori = "Anak";
        }else  {
            Kategori = "Null";
        }
        this.kategori = Kategori;
    }

    public String getJudul() {
        return judul;
    }

    public String getStock() {
        return stock;
    }

    public String getAktor() {
        return aktor;
    }

    public String getSutradara() {
        return sutradara;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getKategori() {
        return kategori;
    }
    
    
}
