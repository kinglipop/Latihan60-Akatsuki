/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118904.latihan60.akatsuki;

/**
 *
 * @author Firman Alfinas
 * Nama     : Firman Alfinas
 * Kelas    : IF 11-K
 * Nim      : 10118904
 * Deskripsi Program : Program ini berisi program untuk menampilkan anggota akatsuki
 */
public class PBO11K10118904Latihan60Akatsuki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Akatsuki akatsuki,gen2,gen3;
        akatsuki = new Akatsuki();
        akatsuki.pendiri();
        akatsuki.Anggota();
        
        gen2 = new Generasi2();
        gen2.pendiri();
        gen2.Anggota();
        
        gen3 = new Generasi3();
        gen3.pendiri();
        gen3.Anggota();
    }
    
}
