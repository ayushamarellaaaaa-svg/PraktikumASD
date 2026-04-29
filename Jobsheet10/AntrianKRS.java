package Jobsheet10;

public class AntrianKRS {
    Mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;
    int sudahDiProses;
    int maxProses = 30;

    public AntrianKRS(int max) {
        this.max = max;
        this.data = new Mahasiswa[max];
        front = 0;
        rear = -1;
        size = 0;
        sudahDiProses = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = rear = -1;
        size = 0;
        System.out.println("Antrian dikosongkan");
    }

    public void enqueue(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " masuk antrian");
    }

    public void dequeue2Mahasiswa() {
        if (size < 2) {
            System.out.println("Minimal 2 Mahasiswa!");
            return;
        }
        if (sudahDiProses >= maxProses) {
            System.out.println("Kuota Mahasiswa penuh!");
            return;
        }

        System.out.println("Memproses 2 Mahasiswa: ");

        for (int i = 0; i < 2; i++) {
            Mahasiswa mhs = data[front];
            mhs.tampilkanData();
            front = (front + 1) % max;
            size--;
            sudahDiProses++;
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian: ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void tampilkan2Terdepan() {
        if (size < 2) {
            System.out.println("Minimal 2 Mahasiswa!");
            return;
        }
        System.out.println("2 Antrian Terdepan: ");
        data[front].tampilkanData();
        data[(front + 1) % max].tampilkanData();
    }

    public void tampilkanAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Mahasiswa paling belakang: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }

    public void jumlahAntrian() {
        System.out.println("Jumlah Mahasiswa dalam Antrian: " + size);
    }

    public void jumlahSudahDiProses() {
        System.out.println("Jumlah Mahasiswa yang sudah diproses: " + sudahDiProses);
    }

    public void jumlahSisaKuota() {
        int sisaKuota = maxProses - sudahDiProses;
        System.out.println("Sisa Kuota Mahasiswa yang bisa diproses: " + sisaKuota);
    }
}
