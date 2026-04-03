package Jobsheet5;

import java.util.Scanner;

public class DosenMain05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DataDosen05 data = new DataDosen05();

        int pilih;
        do {
            System.out.println("=== Pilih menu data dosen: ===");
            System.out.println("1. Tambah");
            System.out.println("2. Tampil");
            System.out.println("3. Sorting ASC");
            System.out.println("4. Sorting DSC");
            System.out.println("5. Keluar");
            System.out.println("=============================");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            System.out.println();

            switch (pilih) {
                case 1:
                    sc.nextLine();
                    System.out.print("Kode: ");
                    String kd = sc.nextLine();
                    System.out.print("Nama: ");
                    String nm = sc.nextLine();
                    System.out.print("Jenis Kelamin (Laki-laki / Perempuan): ");
                    String jkInput = sc.nextLine();
                    boolean jk = jkInput.equalsIgnoreCase("Laki-laki");
                    System.out.print("Usia: ");
                    int usia = sc.nextInt();
                    System.out.println("------------------");
                    System.out.println();

                    data.tambah(new Dosen05(kd, nm, jk, usia));
                    break;

                case 2:
                    data.tampil();
                    break;

                case 3:
                    data.sortingASC();
                    data.tampil();
                    break;

                case 4:
                    data.sortingDSC();
                    data.tampil();
                    break;
            }
        } while (pilih != 0);
    }
}