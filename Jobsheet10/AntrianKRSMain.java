package Jobsheet10;

import java.util.Scanner;

public class AntrianKRSMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AntrianKRS antrian = new AntrianKRS(10);
        int pilih;

        do {
            System.out.println("\n=== Menu Antrian KRS ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian KRS");
            System.out.println("2. Memproses 2 Mahasiswa dari Antrian KRS");
            System.out.println("3. Semua Antrian KRS");
            System.out.println("4. 2 Antrian KRS Terdepan");
            System.out.println("5. Jumlah Antrian KRS");
            System.out.println("6. Antrian KRS Paling Belakang");
            System.out.println("7. Jumlah Mahasiswa yang Sudah Diproses");
            System.out.println("8. Sisa Kuota Mahasiswa");
            System.out.println("9. Mengosongkan Antrian KRS");
            System.out.println("0. Keluar");
            System.out.println("=========================");
            System.out.print("Pilih Menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();

                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.enqueue(mhs);
                    break;

                case 2:
                    antrian.dequeue2Mahasiswa();
                    break;

                case 3:
                    antrian.tampilkanSemua();
                    break;

                case 4:
                    antrian.tampilkan2Terdepan();
                    break;

                case 5:
                    antrian.jumlahAntrian();
                    break;

                case 6:
                    antrian.tampilkanAkhir();
                    break;

                case 7:
                    antrian.jumlahSudahDiProses();
                    break;

                case 8:
                    antrian.jumlahSisaKuota();
                    break;

                case 9:
                    antrian.clear();
                    break;

                case 0:
                    System.out.println("Terima kasih telah mengagunakan layanan Antrian KRS");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 0);
    }
}
