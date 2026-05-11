package Jobsheet12;

import java.awt.List;
import java.util.Scanner;

public class DLLMain05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedList dll = new DoubleLinkedList();
        int pilihan;

        do{
            System.out.println("\n=== Menu Double Linked List ===");
            System.out.println("1. Tambah data di Awal");
            System.out.println("2. Tambah data di Akhir");
            System.out.println("3. Sisipkan data di tengah (setelah NIM)");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Tampilkan data");
            System.out.println("7. Tampilkan data terbalik");
            System.out.println("8. Tambah data pada indeks tertentu");
            System.out.println("9. Hapus data setelah NIM tertentu");
            System.out.println("10. Hapus data pada indeks tertentu");
            System.out.println("11. Tampilkan data pertama");
            System.out.println("12. Tampilkan data terakhir");
            System.out.println("13. Tampilkan data pada indeks tertentu");
            System.out.println("14. Tampilkan jumlah data");
            System.out.println("0. Keluar");
            System.out.println("==============================");
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    Mahasiswa05 mshAwal = Mahasiswa05.inputMahasiswa(sc);
                    dll.addFirst(mshAwal);
                    break;
                case 2:
                    Mahasiswa05 mhsAkhir = Mahasiswa05.inputMahasiswa(sc);
                    dll.addLast(mhsAkhir);
                    break;
                case 3:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String keyNim = sc.nextLine();
                    System.out.println("Masukkan data baru:");
                    Mahasiswa05 dataBaru = Mahasiswa05.inputMahasiswa(sc);
                    dll.insertAfter(keyNim, dataBaru);
                    break;
                
                case 4:
                    dll.removeFirst();
                    break;
                
                case 5: 
                    dll.removeLast();
                    break;
                
                case 6:
                    dll.print();
                    break;
                
                case 7:
                    dll.printReverse();
                    break;
                
                case 8: 
                    System.out.print("Masukkan indeks: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Masukkan data baru:");
                    Mahasiswa05 dataIndex = Mahasiswa05.inputMahasiswa(sc);
                    dll.add(index, dataIndex);
                    break;
                
                case 9:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nimAfter = sc.nextLine();
                    dll.removeAfter(nimAfter);
                    break;
                
                case 10:
                    System.out.print("Masukkan indeks: ");
                    int indexRemove = sc.nextInt();
                    sc.nextLine();
                    dll.remove(indexRemove);
                    break;
                
                case 11:
                    dll.getFirst();
                    break;
                
                case 12:
                    dll.getLast();
                    break;
                
                case 13:
                    System.out.print("Masukkan indeks: ");
                    int indexShow = sc.nextInt();
                    sc.nextLine();
                    dll.getIndex(indexShow);
                    break;
                
                case 14:
                    System.out.println("Jumlah data: " + dll.getSize());
                    break;
                
                case 0: 
                    System.out.println("Keluar dari program");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
    }
}
