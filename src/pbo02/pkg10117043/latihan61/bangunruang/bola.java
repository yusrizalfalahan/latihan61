/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo02.pkg10117043.latihan61.bangunruang;

/**
 *
 * @author Acer
 */
public class bola extends bangunruang{
private double r;

 public void setR(double r) {
        this.r = r;
    }
    public double getR() {
        return r;
    }

   

    @Override
    public double hitungvolume() {
         return (4 * 3.14 * r * r * r) / 3;
    }
    
}
