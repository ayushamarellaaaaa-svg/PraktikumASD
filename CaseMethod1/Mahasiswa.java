package CaseMethod1;

public class Mahasiswa {
    String nim, nama, prodi,no_hp;

    Mahasiswa(String nim, String nama, String prodi, String no_hp) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.no_hp = no_hp;
    }

    void tampil() {
        System.out.printf("| %-5s | %-10s | %-25s | %-10s\n", nim, nama, prodi, no_hp);
    }
}
