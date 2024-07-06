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
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // error handling
        try {
            // IO Sederhana
            Scanner scanner = new Scanner(System.in);
            // Array
            BajuDetail[] bajuArray = new BajuDetail[2];

            // perulangan
            for (int i = 0; i < bajuArray.length; i++) {
                System.out.print("Masukan Merk Baju " + (i + 1) + ": ");
                String merk = scanner.nextLine();

                String kodeBaju;
                while (true) {
                    System.out.print("Masukan Kode Baju " + (i + 1) + " (minimal 4 karakter): ");
                    kodeBaju = scanner.nextLine();
                    if (kodeBaju.length() >= 4) {
                        break;
                    } else {
                        System.out.println("Kode Baju harus memiliki minimal 4 karakter.");
                    }
                }

                // objek
                bajuArray[i] = new BajuDetail(merk, kodeBaju);
            }

            // perulangan
            for (BajuDetail baju : bajuArray) {
                System.out.println("=================");
                System.out.println("Detail Baju: ");
                System.out.println(baju.DisplayInfo());
            }
        } catch (Exception e) {
            System.out.println("Kesalahan Umum: " + e.getMessage());
        }
    }
}
