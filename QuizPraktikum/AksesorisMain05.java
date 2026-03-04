package QuizPraktikum;

import java.util.Scanner;

public class AksesorisMain05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aksesoris05[] arrayAksesoris05 = new Aksesoris05[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Masukkan Data Aksesoris ke-" + (i + 1));
            System.out.print("Nama     : ");
            String nama = sc.nextLine();
            System.out.print("Kategori : ");
            String kategori = sc.nextLine();
            System.out.print("Harga    : ");
            int harga = sc.nextInt();
            System.out.print("Terjual  : ");
            int Terjual = sc.nextInt();
            System.out.print("Stok     : ");
            int Stok = sc.nextInt();
            sc.nextLine();
            System.out.println("-----------------------");

            arrayAksesoris05[i] = new Aksesoris05(nama, kategori, harga, Terjual, Stok);
        }

        dataAksesoris05 data = new dataAksesoris05();

        System.out.println("\n===== Data Seluruh Aksesoris =====");
        data.dataSemuaAksesoris(arrayAksesoris05);
        System.out.println();
        System.out.println("\n===== Total Penjualan =====");
        data.hitungTotalPenjualan(arrayAksesoris05);
        System.out.println();
        System.out.println("\n===== Aksesoris ter Mahal =====");
        data.aksesorisTerMahal(arrayAksesoris05);
        System.out.println();
        System.out.println("\n===== Stok Aksesoris =====");
        data.cekStok(arrayAksesoris05);
    }
}
