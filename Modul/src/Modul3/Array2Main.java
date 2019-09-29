/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul3;

/**
 *
 * @author syafi
 */
public class Array2Main {
    public static void main(String[] args) {
        Array2 arr = new Array2();
        int[] data = {2,5,3,5,9,5};
        arr.setData(data);
        arr.tampil("Data sebelum diganti ");
        arr.tampil(arr.getData());
        arr.tampil("data setelah diganti ");
        arr.setPergantian(arr.getData(), 5, 1);
        arr.tampil(arr.getPergantian());
        arr.tampil("data setelah Dikali ");
        arr.setPerkalian(arr.getData(), 0.5);
        arr.tampil(arr.getPerkalian());
    }
}
