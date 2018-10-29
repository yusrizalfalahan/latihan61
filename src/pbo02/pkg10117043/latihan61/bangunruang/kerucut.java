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
public class kerucut extends bangunruang {
private double t;
private double r;

    public void setT(double t) {
        this.t = t;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getT() {
        return t;
    }

    public double getR() {
        return r;
    }



    @Override
    public double hitungvolume() {
        return (1 * 3.14 * r * r * t) / 3;
    }
    
}
