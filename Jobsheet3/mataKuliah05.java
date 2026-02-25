package Jobsheet3;

import java.util.Scanner;

public class mataKuliah05 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public mataKuliah05(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks =  sks;
        this.jumlahJam = jumlahJam;
    }

    void tambahData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kode Matakuliah  : ");
        kode = sc.nextLine();
        System.out.print("Nama Matakuliah  : ");
        nama = sc.nextLine();
        System.out.print("SKS              : ");
        sks = sc.nextInt();
        System.out.print("Jumlah Jam       : ");
        jumlahJam = sc.nextInt();
    }

    void cetakInfo() {
        System.out.println("Kode Matakuliah   : " + kode);
        System.out.println("Nama Matakuliah   : " + nama);
        System.out.println("SKS               : " + sks);
        System.out.println("Jumlah Jam        : " + jumlahJam);
    }
}
