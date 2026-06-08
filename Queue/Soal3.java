package Queue;

import java.util.Scanner;

public class Soal3 {
    static class Queue {
        int[] data; // array penyimpan data
        int front; // indeks depan
        int rear; // indeks belakang
        int size; // jumlah elemen saat ini
        int kapasitas; // kapasitas maksimum

        Queue(int kapasitas) {
            this.kapasitas = kapasitas;
            this.data = new int[kapasitas];
            this.front = 0;
            this.rear = 0;
            this.size = 0;
        }

        // Mengecek apakah antrian penuh
        boolean isFull() {
            return size == kapasitas;
        }

        // Mengecek apakah antrian kosong
        boolean isEmpty() {
            return size == 0;
        }

        // Menambahkan data ke belakang antrian
        void enqueue(int nilai) {
            if (isFull()) {
                System.out.println("Antrian penuh! Tidak bisa menambahkan data.");
                return;
            }
            data[rear] = nilai;
            rear = (rear + 1) % kapasitas;
            size++;
            System.out.println("Data " + nilai + " berhasil dimasukkan.");
        }

        // Melihat elemen terdepan tanpa menghapusnya
        void peek() {
            if (isEmpty()) {
                System.out.println("Antrian kosong!");
                return;
            }
            System.out.println("Elemen terdepan: " + data[front]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menerima kapasitas dari pengguna
        System.out.print("Masukkan kapasitas maksimum antrian: ");
        int kapasitas = scanner.nextInt();

        Queue antrian = new Queue(kapasitas);

        // Mengecek apakah antrian penuh (sebelum ada data)
        System.out.println("Antrian penuh? " + antrian.isFull());

        // Memasukkan data 101
        antrian.enqueue(101);

        // Mengecek elemen terdepan dengan peek()
        antrian.peek();

        scanner.close();
    }

}
