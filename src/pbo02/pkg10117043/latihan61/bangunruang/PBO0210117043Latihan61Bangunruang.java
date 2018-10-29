/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo02.pkg10117043.latihan61.bangunruang;

/**
 *NAMA       : Yusrizal Falahan
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117043
 * @author Acer
 */
public class PBO0210117043Latihan61Bangunruang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        bola nBola = new bola();
        tabung nTabung = new tabung();
        kerucut nKerucut = new kerucut();

        nBola.setR(7);
        System.out.println("1. Volume Bola :");
        System.out.printf("   Hasil = %,12.1f%n", (double) nBola.hitungvolume());
        System.out.println("");

        nTabung.setH(21);
        nTabung.setR(10);
        System.out.println("2. Volume Tabung : ");
        System.out.println("Hasil = " + (int) nTabung.hitungvolume());
        System.out.println("");

        nKerucut.setR(14);
        nKerucut.setT(9);

        System.out.println("3. Volume Kerucut : ");
        System.out.println("   Hasil = " + (int) nKerucut.hitungvolume());

    }
    
    
}
