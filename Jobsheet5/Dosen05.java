package Jobsheet5;

public class Dosen05 {

    String kode, nama;
    boolean jenisKelamin;
    int usia;

    Dosen05(String kd, String name, boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil() {
        System.out.println("Kode          : " + kode);
        System.out.println("Nama          : " + nama);
        String jk = jenisKelamin ? "Laki-laki" : "Perempuan";
        System.out.println("Jenis Kelamin : " + jk);
        System.out.println("Usia          : " + usia);
    }
}
