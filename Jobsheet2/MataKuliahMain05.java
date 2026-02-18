package Jobsheet2;

public class MataKuliahMain05 {
    public static void main(String[] args) {
        MataKuliah05 mk1 = new MataKuliah05();
        mk1.kodeMK = "TT101";
        mk1.nama = "Algoritma Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 4;

        MataKuliah05 mk2 = new MataKuliah05("TI102", "Praktikum Algoritma Struktur Data", 4, 6);

        mk1.tampilInformasi();
        System.out.println();
        mk2.tampilInformasi();
        System.out.println();

        mk1.ubahSKS(2);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);

        System.out.println();

        mk2.ubahSKS(3);
        mk2.tambahJam(1);
        mk2.kurangiJam(10);
    }
}