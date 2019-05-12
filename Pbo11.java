package pbo11;

import java.util.Scanner;

public class Pbo11 {

    public static void main(String[] args) {
        int jml, pil;

        Scanner input = new Scanner(System.in);
        Alat alt = new Alat();
        AlatMandi mandi = new AlatMandi();
        AlatTulis tulis = new AlatTulis();
        AlatKesehatan sehat = new AlatKesehatan();

        System.out.print("Jumlah Alat = ");
        jml = input.nextInt();
        System.out.println("1. Alat Mandi");
        System.out.println("2. Alat Tulis");
        System.out.println("3. Alat Kesehatan");

        for (int i = 1; i <= jml; i++) {
            System.out.println("\nData Ke-" + i);
            System.out.print("Pilihan = ");
            pil = input.nextInt();
            switch (pil) {
                case 1:
                    mandi.nama(null);
                    mandi.merk(null);
                    mandi.hargabeli(i);
                    mandi.wujud();
                    mandi.warna();
                    break;
                case 2:
                    mandi.nama(null);
                    mandi.merk(null);
                    mandi.hargabeli(i);
                    tulis.fungsi();
                    tulis.fungsi();
                    break;
                case 3:
                    mandi.nama(null);
                    mandi.merk(null);
                    mandi.hargabeli(i);
                    sehat.jenis();
                    sehat.jenis();
                    break;
                default:
                    System.out.println("====Salah====");
                    break;
            }
            System.out.println("\n------------------------\n");
            switch (pil) {
                case 1:
                    System.out.println("Nama = " + alt.nama);
                    System.out.println("Merk = " + alt.merk);
                    System.out.println("Harga = " + alt.harga);
                    System.out.println("Wujud = " + mandi.wu);
                    System.out.println("Warna = " + mandi.war);
                    break;
                case 2:
                    System.out.println("Nama = " + alt.nama);
                    System.out.println("Merk = " + alt.merk);
                    System.out.println("Harga = " + alt.harga);
                    System.out.println("Fungsi = " + tulis.fung);
                    System.out.println("Dimensi = " + tulis.pan + " x " + tulis.lbr);
                    break;
                case 3:
                    System.out.println("Nama = " + alt.nama);
                    System.out.println("Merk = " + alt.merk);
                    System.out.println("Harga = " + alt.harga);
                    System.out.println("Jenis = " + sehat.jns);
                    System.out.println("Manfaat = " + sehat.man);
                    break;
                default:
                    break;
            }
        }

    }

}
