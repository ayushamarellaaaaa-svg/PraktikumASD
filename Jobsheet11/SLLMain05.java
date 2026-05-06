package Jobsheet11;

import java.util.Scanner;

public class SLLMain05 {
    public static void main(String[] args) {
        SingleLinkedList05 sll = new SingleLinkedList05();
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine(); 

        for (int i = 1; i <= jumlah; i++) {
            System.out.println("\nMasukkan data mahasiswa ke-" + i + ":");
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine(); 

            System.out.println("\nPilih metode penambahan:");
            System.out.println("1. addFirst (Tambah di awal)");
            System.out.println("2. addLast (Tambah di akhir)");
            System.out.println("3. insertAfter (Insert setelah nama tertentu)");
            System.out.println("4. insertAt (Insert pada index tertentu)\n");
            System.out.print("Pilihan: ");
            int pilihan = sc.nextInt();
            System.out.println();
            sc.nextLine();

            Mahasiswa05 mhs = new Mahasiswa05(nama, nim, kelas, ipk);
            
            switch (pilihan) {
                case 1:
                    sll.addFirst(mhs);
                    sll.print();
                    break;
                case 2:
                    sll.addLast(mhs);
                    sll.print();
                    break;
                case 3:
                    System.out.print("Masukkan nama yang menjadi key: ");
                    String key = sc.nextLine();
                    sll.insertAfter(key, mhs);
                    sll.print();
                    break;
                case 4:
                    System.out.print("Masukkan index: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    sll.insertAt(index, mhs);
                    sll.print();
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        }

        System.out.println("Data index ke-1: ");
        sll.getData(1);

        System.out.println("Data mahasiswa an Bimon berada pada index: " + sll.indexOf("Bimon"));
        System.out.println();
        
        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}
