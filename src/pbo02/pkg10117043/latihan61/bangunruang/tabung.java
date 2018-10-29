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
public class tabung extends bangunruang {
    private double r;
    private double h;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    
    @Override
    public double hitungvolume() {
        return 3.14 * r * r * h;
    }
    
}
