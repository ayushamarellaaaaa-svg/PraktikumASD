package CaseMethod2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DLLAntrian antrian = new DLLAntrian();
        DLLPesanan pesanan = new DLLPesanan();
        int pilihan;

        do {
            System.out.println("\n============================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("============================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesanan");
            System.out.println("4. Lapor Pesanan");
            // System.out.println("5. Hapus Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            System.out.println("----------------------");
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Nama Pembeli: ");
                    String namaPembeli = sc.nextLine();
                    System.out.print("No HP       : ");
                    String noHp = sc.nextLine();

                    antrian.tambahAntrian(namaPembeli, noHp);
                    System.out.println("Antrian berhasil ditambahkan dengan nomor antrian: " + antrian.size);
                    break;

                case 2:
                    antrian.tampilAntrian();
                    break;

                case 3:
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian kosong! tidak ada pembeli yang dapat dilayani.");

                        break;
                    }

                    System.out.print("Masukkan Nomor Antrian: ");
                    int indexRemove = sc.nextInt();
                    sc.nextLine();
                    antrian.remove(indexRemove);
                    System.out.println();
                    System.out.print("Kode Pesanan : ");
                    int kodePesanan = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nama Pesanan : ");
                    String namaPesanan = sc.nextLine();
                    System.out.print("Harga        : ");
                    int harga = sc.nextInt();
                    sc.nextLine();

                    Pembeli selesai = antrian.hapusAntrian();

                    pesanan.tambahPesanan(kodePesanan, namaPesanan, selesai.namaPembeli, harga);

                    System.out.println(selesai.namaPembeli + " telah memesan " + namaPesanan + " dengan harga " + harga);
                    
                    break;

                case 4:
                    pesanan.tampilPesanan();
                    break;
                
                // case 5:
                //     System.out.print("Masukkan Nomor Antrian: ");
                //     int indexRemove = sc.nextInt();
                //     sc.nextLine();
                //     antrian.remove(indexRemove);
                //     break;

                case 0:
                    System.out.println("Terima kasih!");
                    sc.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);

    }
}
