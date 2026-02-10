package Jobsheet1;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahMK = 8;

        String[] mk = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking dan Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };

        double[] nilaiAngka = new double[jumlahMK];
        String[] nilaiHuruf = new String[jumlahMK];
        double[] nilaiSetara = new double[jumlahMK];
        double totalNilai = 0;
        int totalSkS = 0;

        int[] sks = {2,3,3,3,3,2,2,3};

        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        for (int i = 0; i < jumlahMK; i++) {
            System.out.print("Masukkan nilai angka untuk MK " + mk[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();

            if (nilaiAngka[i] > 80) {
                nilaiHuruf[i] = "A";
                nilaiSetara[i] = 4.0;
            } else if (nilaiAngka[i] > 73) {
                nilaiHuruf[i] = "B+";
                nilaiSetara[i] = 3.5;
            } else if (nilaiAngka[i] > 65) {
                nilaiHuruf[i] = "B";
                nilaiSetara[i] = 3.0;
            } else if (nilaiAngka[i] > 60) {
                nilaiHuruf[i] = "C+";
                nilaiSetara[i] = 2.5;
            } else if (nilaiAngka[i] > 50) {
                nilaiHuruf[i] = "C";
                nilaiSetara[i] = 2.0;
            } else if (nilaiAngka[i] > 39) {
                nilaiHuruf[i] = "D";
                nilaiSetara[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E";
                nilaiSetara[i] = 1.0;
            }

            totalNilai = totalNilai + (nilaiSetara[i] * sks[i]);
            totalSkS = totalSkS + sks[i];
        }

        double ip = totalNilai / totalSkS;

        System.out.println();

        System.out.println("================================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("================================");

        System.out.printf("%-40s %-12s %-12s %-12s\n",
                         "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        for (int i = 0; i < jumlahMK; i++) {
            System.out.printf("%-40s %-12.2f %-12s %-12.2f\n",
                mk[i], nilaiAngka[i], nilaiHuruf[i], nilaiSetara[i]);
        }

        System.out.println("================================");
        System.out.println("IP : " + ip);
    }
}

