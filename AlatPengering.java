package pbo11;

import java.util.Scanner;

public class AlatTulis extends Alat {

    static String fung;
    static double pan, lbr;

    public void fungsi() {
        System.out.println("fungsi : ");
        fung = input.next();
    }

    public void dimensi() {
        System.out.println("panjang :");
        pan = input.nextDouble();
        System.out.println("lebar :");
        lbr = input.nextDouble();
    }

}
