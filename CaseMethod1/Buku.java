package CaseMethod1;

public class Buku {
    String kodeBuku, judulBuku;
    int tahunTerbit;

    Buku(String kodeBuku, String judulBuku, int tahunTerbit) {
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
    }

    void tampil() {
        System.out.printf("| %-5s | %-15s | %-5d |\n", kodeBuku, judulBuku, tahunTerbit);
    }
}
