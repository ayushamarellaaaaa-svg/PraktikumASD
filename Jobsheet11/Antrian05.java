package Jobsheet11;

public class Antrian05 {
    String nama;
    String nim;
    String keperluan;

    public Antrian05(String nama, String nim, String keperluan) {
        this.nama = nama;
        this.nim = nim;
        this.keperluan = keperluan;
    }

    public void tampilkanAntrian() {
        System.out.printf("%-10s %-10s %-10s\n", nama, nim, keperluan);
    }
}
