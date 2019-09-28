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
public class Array1Main {
    public static void main(String[] args) {
        Array1 arr = new Array1();
        int data[] = {-5,-3,-6,-3,-4};
        arr.setData(data);
        arr.cetak(arr.getData());
        
        arr.setMinimum(arr.getData());
        arr.cetak("nilai Min = "+arr.getMinimum());
        
        arr.setMaksimum(arr.getData());
        arr.cetak("Nilai Maks = "+arr.getMaksimum());
        
        arr.setRatarata(arr.getData());
        arr.cetak("Nilai rata = "+arr.getRatarata());
        
        arr.setIndex(-3);
        arr.cetak("-3 berada pada index = ");
        arr.indexcetak(arr.getIndex());
    }
}
