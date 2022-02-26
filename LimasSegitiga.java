package pbo_2;

public class LimasSegitiga {

    private double alas, tinggiL, tinggiS, tinggiSS;

    public void panjang(double panjang) {
        this.alas = panjang;
    }

    public void tinggiL(double tinggiL) {
        this.tinggiL = tinggiL;
    }

    public void tinggiS(double tinggiA) {
        this.tinggiS = tinggiA;
    }

    public void tinggiSS(double tinggiSS) {
        this.tinggiSS = tinggiSS;
    }

    public double luasAlas() {
        return alas * tinggiS / 2;
    }

    public double luasSamping() {
        return alas * tinggiSS / 2;
    }

    public double luasLimas() {
        return luasAlas() + luasSamping() * 3;
    }

    public double Volume() {
        return luasAlas() * tinggiL / 3;
    }

    public void Cetak() {
        System.out.println("===========================");
        System.out.println("Luas Alas\t\t\t:" + luasAlas());
        System.out.println("Luas Segitiga Sisi Samping\t:" + luasSamping());
        System.out.println("Luas Permukaan Limas\t\t:" + luasLimas());
        System.out.println("Volume Limas\t\t\t:" + Volume());
    }

}
