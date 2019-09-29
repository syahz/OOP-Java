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
public class Array2 {
    private int[] data;
    private int x, y;
    private double[] data2 = new double[6];

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public double[] getData2() {
        return data2;
    }

    public void setData2(double[] data2) {
        this.data2 = data2;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }
    
    public void setPergantian(int[]data, int x, int y){
        for (int i = 0; i < data.length; i++) {
            if (data[i] == x) {
                data[i] = y;
            }
        }
    }
    
    public int[] getPergantian(){
        return data;
    }
    
    public void setPerkalian(int[]data, double nilaiperkalian){
        for (int i = 0; i < data.length; i++) {
            data2[i] = data[i] * nilaiperkalian;
        }
    }
    
    public double[] getPerkalian(){
        return data2;
    }
    public void tampil(int[] data){
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" ");
        }   System.out.println();
    }
    
    public void tampil(String a){
        System.out.println(a);
    }
    public void tampil (double[] data2){
        for (int i = 0; i < data2.length; i++) {
            System.out.print(data2[i]+" ");
        }   System.out.println();
    }
}
