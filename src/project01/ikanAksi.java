/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project01;

/**
 *
 * @author irwan
 */
public class ikanAksi {
    public static void main(String[] args) {
        Ikan lumba_lumba = new Ikan();
        Ikan paus = new Ikan();
        Ikan hiu = new Ikan();
        
        lumba_lumba.alatnapas="Paru-Paru";
        lumba_lumba.gigi="Tajam Kecil";
        lumba_lumba.makan="Ikan Kecil atau Cumi-cumi";
        lumba_lumba.produksi="Melahirkan";
        
        paus.alatnapas="Paru-Paru";
        paus.gigi="Graham Serabut";
        paus.makan="Plankton atau ikan kecil";
        paus.produksi="Melahirkan";
        
        hiu.alatnapas="Insang";
        hiu.gigi="Taring Tajam";
        hiu.makan="Semua Daging";
        hiu.produksi="Bertelur";
    }
}
