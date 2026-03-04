package QuizPraktikum;

public class Aksesoris05 {
    String nama;
    String kategori;
    int harga;
    int terjual;
    int stok;

    public Aksesoris05() {

    }

    public Aksesoris05(String nama, String kategori, int harga, int terjual, int stok) {
        this.nama = nama;
        this.kategori = kategori;
        this.harga = harga;
        this.terjual = terjual;
        this.stok = stok;
    }

    void tampil() {
        System.out.println("Nama      : " + nama);
        System.out.println("Kategori  : " + kategori);
        System.out.println("Harga     : " + harga);
        System.out.println("Terjual   : " + terjual);
        System.out.println("Stok      : " + stok);
    }

}
