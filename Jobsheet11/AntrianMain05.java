package Jobsheet11;

import java.util.Scanner;

public class AntrianMain05 {
    public static void main(String[] args) {
        QueueLinkedList antrian = new QueueLinkedList();
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== ANTRIAN LAYANAN KEMAHASISWAAN ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Cek Antrian kosong");
            System.out.println("4. Cek Antrian penuh");
            System.out.println("5. Kosongkan Antrian");
            System.out.println("6. Lihat Antrian terdepan & terakhir");
            System.out.println("7. Jumlah Mahasiswa dalam Antrian");
            System.out.println("8. Tampilkan Semua Antrian");
            System.out.println("=======================================");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 
            System.out.println();

            switch (pilihan) {
                case 1:
                    System.out.print("Nama      : ");
                    String nama = sc.nextLine();
                    System.out.print("NIM       : ");
                    String nim = sc.nextLine();
                    System.out.print("Keperluan : ");
                    String keperluan = sc.nextLine();
                    Antrian05 antri = new Antrian05(nama, nim, keperluan);
                    antrian.enqueue(antri);
                    break;

                case 2:
                    antrian.dequeue();
                    break;

                case 3:
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian kosong!\n");
                    } else {
                        System.out.println("Antrian tidak kosong, masih ada " + antrian.size + " mahasiswa dalam antrian.\n");
                    }
                    break;

                case 4:
                    if (antrian.isFull()) {
                        System.out.println("Antrian penuh!\n");
                    } else {
                        System.out.println("Antrian tidak penuh, masih bisa menambah antrian.\n");
                    }
                    break;
                
                case 5:
                    antrian.clear();
                    break;

                case 6:
                    antrian.peekFront();
                    antrian.peekRear();
                    break;
                
                case 7:
                    antrian.jumlahAntrian();
                    break;
                
                case 8:
                    antrian.tampilkanSemua();
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 0);
    }
}
