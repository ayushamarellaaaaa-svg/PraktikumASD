package Jobsheet12;

import java.util.Scanner;

public class Mahasiswa05 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    public Mahasiswa05(String nama, String nim, String kelas, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    void tampilInformasi() {
        System.out.printf("%-10s %-10s %-5s %-10.2f\n", nama, nim, kelas, ipk);
    }

    public static Mahasiswa05 inputMahasiswa(Scanner sc) {
        System.out.print("Nama   : ");
        String nama = sc.nextLine();
        System.out.print("NIM    : ");
        String nim = sc.nextLine();
        System.out.print("Kelas  : ");
        String kelas = sc.nextLine();
        System.out.print("IPK    : ");
        double ipk = Double.parseDouble(sc.nextLine());
        return new Mahasiswa05(nama, nim, kelas, ipk);
    }
}
