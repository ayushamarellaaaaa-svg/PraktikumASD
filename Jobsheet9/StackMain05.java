package Jobsheet9;

import java.util.Scanner;

public class StackMain05 {
    public static void main(String[] args) {
        StackSurat05 stack = new StackSurat05(10);

        Scanner sc = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.println();
            System.out.print("Pilih Menu: ");
            pilih = sc.nextInt();
            System.out.println("------------------------");
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat      : ");
                    String id = sc.nextLine();
                    System.out.print("Nama          : ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas         : ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S = Sakit / I = Izin): ");
                    char jenis = sc.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi (hari) : ");
                    int durasi = sc.nextInt();
                    sc.nextLine();

                    Surat05 surat = new Surat05(id, nama, kelas, jenis, durasi);
                    stack.push(surat);
                    System.out.printf("Surat izin dari %s berhasil diterima\n", nama);
                    break;

                case 2:
                    Surat05 diproses = stack.pop();
                    if (diproses != null) {
                        String jenisStr = (diproses.jenisIzin == 'S' || diproses.jenisIzin == 'I') ? "Sakit" : "Izin";
                        System.out.println("Memproses Surat dari : " + diproses.namaMahasiswa);
                        System.out.println("Kelas                : " + diproses.kelas);
                        System.out.println("Jenis Izin           : " + jenisStr);
                        System.out.println("Durasi               : " + diproses.durasi + " hari");
                        System.out.println("surat berhasil divalidasi");
                    }
                    break;

                case 3:
                    Surat05 terakhir = stack.peek();
                    if (terakhir != null) {
                        String jenisStr = (terakhir.jenisIzin == 'S' || terakhir.jenisIzin == 'I') ? "Sakit" : "Izin";
                        System.out.println("=== Surat Izin Terakhir ===");
                        System.out.println("ID Surat   : " + terakhir.idSurat);
                        System.out.println("Nama       : " + terakhir.namaMahasiswa);
                        System.out.println("Kelas      : " + terakhir.kelas);
                        System.out.println("Jenis Izin : " + jenisStr);
                        System.out.println("Durasi     : " + terakhir.durasi + " hari");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cari = sc.nextLine();
                    boolean ditemukan = stack.cariSurat(cari);
                    if (ditemukan) {
                        System.out.println("Surat izin atas nama \"" + cari + "\" ditemukan");
                    } else {
                        System.out.println("Surat izin atas nama \"" + cari + "\" tidak ditemukan");
                    }
                    break;

                case 5:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilih >= 1 && pilih <= 4);
    }
}
