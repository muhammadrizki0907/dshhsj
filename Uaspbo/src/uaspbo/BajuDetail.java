/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uaspbo;

//inheritance
public class BajuDetail extends Baju {
    // polymorhpsm (override)
    public BajuDetail(String merk, String kodeBaju) {
        super(merk, kodeBaju);
    }

    // seleksi
    public String getKodeWarna() {
        String kodeWarna = getKodeBaju().substring(0, 2);
        switch (kodeWarna) {
            case "01":
                return "Merah";
            case "02":
                return "Biru";
            default:
                return "Warna Lain";
        }
    }

    public String getKodeUkuran() {
        String kodeUkuran = getKodeBaju().substring(2, 4);
        switch (kodeUkuran) {
            case "01":
                return "Kecil";
            case "02":
                return "Sedang";
            case "03":
                return "Besar";
            default:
                return "Ukuran Lain";
        }
    }

    // polymorphisme (override)
    @Override
    public String DisplayInfo() {
        return super.DisplayInfo() +
                "\nWarna: " + getKodeWarna() +
                "\nUkuran: " + getKodeUkuran();
    }
}
