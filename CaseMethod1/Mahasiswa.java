package CaseMethod1;

public class Mahasiswa {
    String nim, nama, prodi;

    Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    void tampil() {
        System.out.printf("| %-5s | %-10s | %-25s |\n", nim, nama, prodi);
    }
}
