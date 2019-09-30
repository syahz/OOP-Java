/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul4;

/**
 *
 * @author syafi
 */
public class ArrayMain {
    public static void main(String[] args) {
        array arr = new array();
        int[][] a = {
            {1,2},
            {3,5},
            {6,7}
        };
        int[][] b = {
            {8,9},
            {10,11},
            {12,13}
        };
        double [][] c = {
            {1,2},
            {3,1},
            {4,5}
        };
        
        arr.setA(a);
        arr.tampil("Matrik A");
        arr.tampil(arr.getA());
        
        arr.setB(b);
        arr.tampil("Matrik B");
        arr.tampil(arr.getB());
        arr.setPenjumlahan(a, b);
        arr.tampil("Hasil A+B ");
        arr.tampil(arr.getPenjumlahan());
        
        arr.setPerkalian(arr.getPenjumlahan(), 0.5);
        arr.tampil("Hasil C Dikali 0.5");
        arr.tampil(arr.getKali());
    }
}
