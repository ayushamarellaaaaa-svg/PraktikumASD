package CaseMethod1;

public class Peminjaman {
    Mahasiswa mhs;
    Buku buku;
    int lamaPinjam, denda;

    Peminjaman(Mahasiswa mhs, Buku buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();
    }

    void hitungDenda() {
        if (lamaPinjam > 5) {
            int terlambat = lamaPinjam - 5;
            denda = terlambat * 2000;
        } else { 
            denda = 0;
        }
    }

    void tampil() {
        System.out.printf("| %-5s | %-10s | %-15s | %-5d | Rp %-7d |\n", mhs.nim, mhs.nama, buku.judulBuku, lamaPinjam, denda);
    }
}
