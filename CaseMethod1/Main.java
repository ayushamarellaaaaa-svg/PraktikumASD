package CaseMethod1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Mahasiswa[] mhs = {
                new Mahasiswa("22001", "Andi", "Teknik Informatika"),
                new Mahasiswa("22002", "Budi", "Teknik Informatika"),
                new Mahasiswa("22003", "Citra", "Sistem Informasi Bisnis")
        };

        Buku[] buku = {
                new Buku("B001", "Algortima", 2020),
                new Buku("B002", "Basis Data", 2019),
                new Buku("B003", "Pemrograman", 2021),
                new Buku("B004", "Fisika", 2024)
        };

        Peminjaman[] pinjam = {
                new Peminjaman(mhs[0], buku[0], 7),
                new Peminjaman(mhs[1], buku[1], 3),
                new Peminjaman(mhs[2], buku[2], 10),
                new Peminjaman(mhs[2], buku[3], 6),
                new Peminjaman(mhs[0], buku[1], 4)
        };

        int pilih;

        do {
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan berdasarkan Denda");
            System.out.println("5. Cari berdasarkan NIM");
            System.out.println("0. Keluar\n");
            System.out.print("Pilih Menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {

                case 1:
                    System.out.println("DATA MAHASISWA");
                    System.out.println("--------------------------------------------------");
                    System.out.printf("| %-5s | %-10s | %-25s |\n", "NIM", "Nama", "Prodi");
                    System.out.println("--------------------------------------------------");

                    for (int i = 0; i < mhs.length; i++) {
                        mhs[i].tampil();
                    }

                    System.out.println("--------------------------------------------------");
                    break;

                case 2:
                    System.out.println("\nDATA BUKU");
                    System.out.println("-----------------------------------");
                    System.out.printf("| %-5s | %-15s | %-5s |\n", "Kode", "Judul", "Tahun");
                    System.out.println("-----------------------------------");

                    for (int i = 0; i < buku.length; i++) {
                        buku[i].tampil();
                    }

                    System.out.println("-----------------------------------");
                    break;

                case 3:
                    System.out.println("\nDATA PEMINJAMAN");
                    System.out.println("-------------------------------------------------------------");
                    System.out.printf("| %-5s | %-10s | %-15s | %-5s | %-10s |\n", "NIM", "Nama", "Judul Buku", "Hari","Denda");
                    System.out.println("-------------------------------------------------------------");

                    for (int i = 0; i < pinjam.length; i++) {
                        pinjam[i].tampil();
                    }

                    System.out.println("-------------------------------------------------------------");
                    break;

                case 4:
                    for (int i = 1; i < pinjam.length; i++) {
                        Peminjaman temp = pinjam[i];
                        int j = i - 1;

                        while (j >= 0 && pinjam[j].denda < temp.denda) {
                            pinjam[j + 1] = pinjam[j];
                            j--;
                        }
                        pinjam[j + 1] = temp;
                    }

                    System.out.println("\nDATA SETELAH SORTING DENDA");
                    System.out.println("-------------------------------------------------------------");
                    System.out.printf("| %-5s | %-10s | %-15s | %-5s | %-10s |\n", "NIM", "Nama", "Judul Buku", "Hari",
                            "Denda");
                    System.out.println("-------------------------------------------------------------");

                    for (int i = 0; i < pinjam.length; i++) {
                        pinjam[i].tampil();
                    }

                    System.out.println("-------------------------------------------------------------");
                    break;

                case 5:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String cari = sc.next();

                    for (int i = 0; i < pinjam.length - 1; i++) {
                        for (int j = i + 1; j < pinjam.length; j++) {
                            if (pinjam[i].mhs.nim.compareTo(pinjam[j].mhs.nim) > 0) {
                                Peminjaman tmp = pinjam[i];
                                pinjam[i] = pinjam[j];
                                pinjam[j] = tmp;
                            }
                        }
                    }

                    int left = 0, right = pinjam.length - 1;
                    boolean ditemukan = false;

                    while (left <= right) {
                        int mid = (left + right) / 2;

                        if (pinjam[mid].mhs.nim.equals(cari)) {
                            System.out.println("\nDATA DITEMUKAN");
                            System.out.println("-------------------------------------------------------------");
                            System.out.printf("| %-5s | %-10s | %-15s | %-5s | %-10s |\n", "NIM", "Nama", "Judul Buku","Hari", "Denda");
                            System.out.println("------------------------------------------------------------");
                            pinjam[mid].tampil();
                            System.out.println("-------------------------------------------------------------");
                            ditemukan = true;
                            break;

                        } else if (pinjam[mid].mhs.nim.compareTo(cari) < 0) {
                            left = mid + 1;
                        } else {
                            right = mid - 1;
                        }
                    }

                    if (!ditemukan) {
                        System.out.println("Data tidak ditemukan");
                    }

                    break;

                case 0:
                    System.out.println("Terima kasih");
                    break;

                default:
                    System.out.println("Menu tidak tersedia");
            }

        } while (pilih != 0);

    }

}
