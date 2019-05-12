package pbo11;

import java.util.Scanner;

public class Alat {

    static String nama, merk;
    static long harga;
    static Scanner input = new Scanner(System.in);

    public void hargabeli(double harga) {
        System.out.print("Merk = ");
        merk = input.next();
    }

    public void merk(String merk) {
        System.out.print("Harga = ");
        harga = input.nextLong();

    }

    public void nama(String Nama) {
        System.out.print("Nama = ");
        nama = input.next();

    }
}
