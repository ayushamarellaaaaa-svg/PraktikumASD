package Jobsheet2;

public class DosenMain05 {
    public static void main(String[] args) {
        Dosen05 dsn1 = new Dosen05();
        dsn1.idDosen = "DSN001";
        dsn1.nama = "Vivin Ayu Lestari, S.Pd., M.Kom.";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2015;
        dsn1.bidangKeahlian = "Algoritma Struktur Data";

        Dosen05 dsn2 = new Dosen05("DSN002", "Vit Zuraida", false, 2018, "Dasar Pemrograman");

        dsn1.tampilInformasi();
        System.out.println();
        dsn2.tampilInformasi();
        System.out.println();

        dsn1.setStatusAktif(false);
        dsn1.ubahKeahlian("Pemrograman Berorientasi Objek");
        System.out.println("Masa kerja: " + dsn1.hitungMasaKerja(2025) + " tahun");

        System.out.println();

        dsn2.setStatusAktif(true);
        dsn2.ubahKeahlian("Pengenalan Sistem Informasi");
        System.out.println("Masa kerja: " + dsn2.hitungMasaKerja(2025) + " tahun");
    }
}
