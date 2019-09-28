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
public class Array1 {
    private int minimum, maksimum;
    private double ratarata, jumlahData;
    private int [] data = new int[5];
    private int [] index = new int [5];

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int[] min) {
        for (int i = 0; i < min.length; i++) {
            if (min[i]<minimum) {
                minimum = data[i];
            }
        }
    }

    public int getMaksimum() {
        return maksimum;
    }

    public void setMaksimum(int[] max) {
        this.maksimum = data[0];
        for (int i = 0; i < max.length; i++) {
            if (max[i]>maksimum) {
                maksimum = data[i];
            }
        }
    }
    
    public int[] getIndex(){
        return index;
    }
    public void setIndex(int index){
        for (int i = 0; i < data.length; i++) {
            if (index == data[i]) {
                this.index[i] = i;
            }
        }
    }
    public double getRatarata() {
        return ratarata;
    }

    public void setRatarata(int[] data) {
        for (int i = 0; i < data.length; i++) {
            jumlahData += data[i];
        }   ratarata = (jumlahData / 5);
            
    }
    
    public void cetak (int[] data){
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" ");
        }   System.out.println();
    }
    public void cetak (String a){
        System.out.println(a);
    }
    public void indexcetak (int[] index){
        for (int i = 0; i < index.length; i++) {
            if (index[i] != 0) {
                System.out.print(index[i]);
                
            }   System.out.print(" ");
        }       System.out.println();
    }
}
