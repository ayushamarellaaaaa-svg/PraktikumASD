package Jobsheet3;

import java.util.Scanner;

public class mahasiswaDemo05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        mahasiswa05[] arrayofMahasiswa05 = new mahasiswa05[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrayofMahasiswa05[i] = new mahasiswa05();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM     : ");
            arrayofMahasiswa05[i].nim = sc.nextLine();
            System.out.print("Nama    : ");
            arrayofMahasiswa05[i].nama = sc.nextLine();
            System.out.print("Kelas   : ");
            arrayofMahasiswa05[i].kelas = sc.nextLine();
            System.out.print("IPK     : ");
            dummy = sc.nextLine();
            arrayofMahasiswa05[i].ipk = Float.parseFloat(dummy);
            System.out.println("-------------------------------");
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            arrayofMahasiswa05[i].cetakInfo();
            System.out.println("---------------------------");
        }
    }
}
