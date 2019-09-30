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
public class array {
    private int A[][];
    private int B[][];
    private int jumlah[][];
    private double kali[][];

    public int[][] getA() {
        return A;
    }

    public void setA(int[][] A) {
        this.A = A;
    }

    public int[][] getB() {
        return B;
    }

    public void setB(int[][] B) {
        this.B = B;
    }

    public double[][] getKali() {
        return kali;
    }

    public void setPerkalian(int[][] jumlah, double nilaikali) {
        kali = new double[jumlah.length][jumlah[0].length];
        for (int i = 0; i < jumlah.length; i++) {
            for (int j = 0; j < jumlah[i].length; j++) {
                kali[i][j] = nilaikali*jumlah[i][j];
            }
        }
    }
    
    public void setPenjumlahan(int[][] a, int[][]b){
        jumlah = a;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                jumlah[i][j] = a[i][j]+b[i][j];
            }
        }
    }
    
    public int[][] getPenjumlahan(){
        return jumlah;
    }
    
    public void tampil(int data[][]){
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j]+" ");
            }   System.out.println();
        }
    }
    
    public void tampil(String a){
        System.out.println(a);
    }
    public void tampil(double data[][]){
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j]+" ");
            }   System.out.println();
        }
    }
    
}
