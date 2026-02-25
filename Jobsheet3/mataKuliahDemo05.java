package Jobsheet3;

import java.util.Scanner;

public class mataKuliahDemo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jumlah Matakuliah: ");
        int jumlah = sc.nextInt();

        mataKuliah05[] arrayMataKuliah05 = new mataKuliah05[jumlah];

        for (int i = 0; i < arrayMataKuliah05.length; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));

            arrayMataKuliah05[i] = new mataKuliah05("", "", 0, 0);
            arrayMataKuliah05[i].tambahData();
            System.out.println("--------------------------");
        }

        System.out.println("\nDATA MATA KULIAH");
        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayMataKuliah05[i].cetakInfo();
            System.out.println("--------------------------");
        }
    }
}
