package CaseMethod2;

public class Pesanan {
    int kodePesanan;
    String namaPesanan;
    int harga;
    String namaPembeli;

    public Pesanan(int kodePesanan, String namaPesanan, String namaPembeli, int harga) {
        this.kodePesanan = kodePesanan;
        this.namaPesanan = namaPesanan;
        this.harga = harga;
        this.namaPembeli = namaPembeli;
    }

    void tampilInformasi() {
        System.out.printf("%-15d %-20s %-10d%n", kodePesanan, namaPesanan, harga);
    }
}
