package Jobsheet1;

import java.util.Scanner;

public class Pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilai = new int[4];
        String[] nama = { "Tugas", "Kuis", "UTS", "UAS" };
        double nilaiAkhir;
        String nilaiHuruf;
        String status;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("===============================");

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan Nilai " + nama[i] + ": ");
            nilai[i] = sc.nextInt();

            if (nilai[i] < 0 || nilai[i] > 100) {
                System.out.println("============================");
                System.out.println("Nilai tidak valid!");
                System.out.println("============================");
                return;
            }
        }

        nilaiAkhir = (0.2 * nilai[0]) + (0.2 * nilai[1]) + (0.3 * nilai[2]) + (0.4 * nilai[3]);

        if (nilaiAkhir > 80) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir > 73) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir > 65) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir > 60) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir > 50) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir > 39) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }

        if (nilaiHuruf.equals("A") ||
            nilaiHuruf.equals("B+") ||
            nilaiHuruf.equals("B") ||
            nilaiHuruf.equals("C+") ||
            nilaiHuruf.equals("C")) {
            status = "LULUS";
        } else {
            status = "TIDAK LULUS";
        }

        System.out.println("============================");
        System.out.println("Nilai AKhir : " + nilaiAkhir);
        System.out.println("Nilai Huruf : " + nilaiHuruf);
        System.out.println("============================");
        System.out.println("SELAMAT ANDA " + status);
    }
}
