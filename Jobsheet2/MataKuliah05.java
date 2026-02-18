package Jobsheet2;

public class MataKuliah05 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah05(){

    }

    public MataKuliah05(String kodeMK, String nama, int sks, int jumlahJam){
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilInformasi(){
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam" + jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS telah diubah");
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jumlah jam sekarang: " + jumlahJam);
    }

    void kurangiJam(int jam) {
        if (jumlahJam >= jam) {
            jumlahJam -= jam;
            System.out.println("Jam berhasil dikurangi");
            System.out.println("Jumlah jam sekarang: " + jumlahJam);
        } else {
            System.out.println("Jumlah jam tidak mencukupi");
        }
    }
}
