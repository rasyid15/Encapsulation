package pbo_2;

import java.util.Scanner;

public class RunLimas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LimasSegitiga limas = new LimasSegitiga();
        double alas, tinggiL, tinggiA, tinggiSS;
        System.out.print("Panjang Alas\t\t\t:");
        alas = input.nextDouble();
        System.out.print("Tinggi Alas\t\t\t:");
        tinggiA = input.nextDouble();
        System.out.print("Tinggi Segitiga Sisi Samping\t:");
        tinggiSS = input.nextDouble();
        System.out.print("Tinggi Limas\t\t\t:");
        tinggiL = input.nextDouble();
        limas.panjang(alas);
        limas.tinggiS(tinggiA);
        limas.tinggiSS(tinggiSS);
        limas.tinggiL(tinggiL);
        limas.Cetak();
    }

}
