package Jobsheet1;

import java.util.Scanner;

public class Tugas2 {
    static void inputJadwal(String[][] jadwal, int n) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.println("Data Jadwal ke-" + (i + 1));

            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = sc.nextLine();

            System.out.print("Ruang            : ");
            jadwal[i][1] = sc.nextLine();

            System.out.print("Hari Kuliah      : ");
            jadwal[i][2] = sc.nextLine();

            System.out.print("Jam Kuliah       : ");
            jadwal[i][3] = sc.nextLine();

            System.out.println();
        }
    }

    static void tampilSemua(String[][] jadwal, int n) {
        System.out.println("=================================================");
        System.out.println("DAFTAR HADWAL KULIAH");
        System.out.println("=================================================");
        System.out.printf("%-20s %-10s %-10s %-10s\n",
                "Mata Kuliah", "Ruang", "Hari", "Jam");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-20s %-10s %-10s %-10s\n",
                    jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
        }

        System.out.println("==============================================");
    }

    static void tampilHari(String[][] jadwal, int n, String hari) {
        boolean ada = false;

        System.out.println("\nJadwal Hari " + hari);
        System.out.println("----------------------------------------------");
        System.out.printf("%-20s %-10s %-10s\n", 
                "Mata Kuliah", "Ruang", "Jam");
        System.out.println("----------------------------------------------");

        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.printf("%-20s %-10s %-10s\n",
                                   jadwal[i][0],
                                   jadwal[i][1],
                                   jadwal[i][3]);
            ada = true;

            }
        }

        if (!ada) {
            System.out.println("Tidak ada jadwal");
        }
    }

    static void tampilMK(String[][] jadwal, int n, String mk) {
        boolean ada = false;

        System.out.println("\nJadwal Mata Kuliah " + mk);
        System.out.println("----------------------------------------------");
        System.out.printf("%-20s %-10s %-10s\n", 
                "Mata Kuliah", "Ruang", "Jam");
        System.out.println("----------------------------------------------");

        for (int i = 0; i < n; i++) {
            if (jadwal[i][0].equalsIgnoreCase(mk)) {
                System.out.printf("%-20s %-10s %-10s\n",
                                   jadwal[i][0],
                                   jadwal[i][1],
                                   jadwal[i][3]);
            ada = true;
            }
        }

        if (!ada) {
            System.out.println("Mata Kuliah tidak ditemukan");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Masukkan jumlah jadwal: ");
        n = sc.nextInt();
        System.out.println();
        sc.nextLine();
        

        String[][] jadwal = new String[n][4];

        inputJadwal(jadwal, n);
        tampilSemua(jadwal, n);

        System.out.print("Cari jadwal berdasarkan hari: ");
        String cariHari = sc.nextLine();
        tampilHari(jadwal, n, cariHari);

        System.out.print("\nCari jadwal berdasarkan mata kuliah: ");
        String cariMK = sc.nextLine();
        tampilMK(jadwal, n, cariMK);
    }
}
