/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uaspbo;

/**
 *
 * @author asus0
 */
public class Baju {
    // atribut dan enkapsulasi
    private String merk;
    private String kodeBaju;

    // konstruktor
    public Baju(String merk, String kodeBaju) {
        this.merk = merk;
        this.kodeBaju = kodeBaju;
    }

    // getter
    public String getMerk() {
        return merk;
    }

    public String getKodeBaju() {
        return kodeBaju;
    }

    // setter
    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setKodeBaju(String kodeBaju) {
        this.kodeBaju = kodeBaju;
    }

    // polymorphisme (overloading)
    public String DisplayInfo() {
        return "Merk: " + getMerk() + "\nKode Baju: " + getKodeBaju();
    }

    public String DisplayInfo(String bahan) {
        return DisplayInfo() + "\nBahan: " + bahan;
    }
}
