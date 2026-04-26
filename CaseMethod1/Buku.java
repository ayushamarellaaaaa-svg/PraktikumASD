package CaseMethod1;

public class Buku {
    String kodeBuku, judulBuku, penerbit;
    int tahunTerbit;

    Buku(String kodeBuku, String judulBuku, int tahunTerbit, String penerbit) {
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.penerbit = penerbit;
    }

    void tampil() {
        System.out.printf("| %-5s | %-15s | %-5d | %-25s\n", kodeBuku, judulBuku, tahunTerbit, penerbit);
    }
}
