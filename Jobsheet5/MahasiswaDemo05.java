package Jobsheet5;

import java.util.Scanner;

public class MahasiswaDemo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Mahasiswa: ");
        int n = sc.nextInt();
        sc.nextLine();

        MahasiswaBerprestasi05 list = new MahasiswaBerprestasi05(n);

        for (int i = 0; i < n; i++) {
            System.out.println("Data mahasiswa ke-" + (i + 1));

            System.out.print("NIM   : ");
            String nim = sc.nextLine();

            System.out.print("Nama  : ");
            String nama = sc.nextLine();

            System.out.print("Kelas : ");
            String kelas = sc.nextLine();

            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            System.out.println("-------------------------");

            Mahasiswa05 m = new Mahasiswa05(nim, nama, kelas, ipk);
            list.tambah(m);

            System.out.println();
        }

        list.tampil();
        System.out.println("=========================");
        System.out.println("Pencarian Data");
        System.out.println("=========================");
        System.out.println("Masukkan IPK mahasiswa yang dicari");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();

        System.out.println("=========================");
        System.out.println("menggunakan binary search");
        System.out.println("=========================");
        double posisi2 = list.findBinarySearch(cari, 0, n -1);
        int pss2 = (int)posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
        sc.nextLine();

        // System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC): ");
        // list.bubbleSort();
        // list.tampil();

        // System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC): ");
        // list.selectionSort();
        // list.tampil();

        // System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC): ");
        // list.insertionSortDesc();
        // list.tampil();
    }
}
