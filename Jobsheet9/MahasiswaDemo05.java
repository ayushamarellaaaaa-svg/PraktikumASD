package Jobsheet9;

import java.util.Scanner;

public class MahasiswaDemo05 {
    public static void main(String[] args) {
        StackTugasMahasiswa05 stack = new StackTugasMahasiswa05(5);

        Scanner sc = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu: ");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Terbawah");
            System.out.println("6. Hitung Tugas Terkumpul");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();

                    Mahasiswa05 mhs = new Mahasiswa05(nim, nama, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;

                case 2:
                    Mahasiswa05 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai Tugas dari " + dinilai.nama);
                        System.out.print("Masukkan Nilai (0-100): ");
                        int nilai = sc.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, dinilai.nilai);
                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.println("Nilai Biner Tugas: " + biner);
                    }
                    break;

                case 3:
                    Mahasiswa05 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpukan oleh " + lihat.nama);
                    }
                    break;

                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("----------------------------");
                    System.out.printf("%-10s %-10s %-10s\n", "Nama", "NIM", "Kelas");
                    System.out.println("----------------------------");
                    stack.print();
                    break;

                case 5:
                    Mahasiswa05 bawah = stack.peekBottom();
                    if (bawah != null) {
                        System.out.println("Mahasiswa pertama yang mengumpulkan tugas: " + bawah.nama);
                    }
                    break;

                case 6:
                    int jumlah = stack.countTugas();
                    System.out.println("Jumlah tugas yang sudah dikumpulkan: " + jumlah);
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");

            }

        } while (pilih >= 1 && pilih <= 6);

    }
}
