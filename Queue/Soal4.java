package Queue;

public class Soal4 {
    static class Queue {
        int[] data;
        int front;
        int rear;
        int kapasitas;

        Queue(int kapasitas) {
            this.kapasitas = kapasitas;
            this.data = new int[kapasitas];
            this.front = -1;
            this.rear = -1;
        }

        boolean isEmpty() {
            return front == -1;
        }

        boolean isFull() {
            return rear == kapasitas - 1;
        }

        // Menambahkan pasien ke antrian
        void enqueue(int id) {
            if (isFull()) {
                System.out.println("Antrian penuh!");
                return;
            }
            if (isEmpty()) {
                front = 0; // front mulai dari 0 saat pertama kali ada data
            }
            rear++;
            data[rear] = id;
            System.out.println("Pasien " + id + " mendaftar. front=" + front + ", rear=" + rear);
        }

        // Memanggil (menghapus) pasien terdepan
        void dequeue() {
            if (isEmpty()) {
                System.out.println("Antrian kosong!");
                return;
            }

            int dipanggil = data[front];

            // Jika elemen terakhir yang dihapus, reset front dan rear ke -1
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }

            System.out.println("Pasien " + dipanggil + " dipanggil dokter. front=" + front + ", rear=" + rear);
        }
    }

    public static void main(String[] args) {
        Queue klinik = new Queue(5);

        System.out.println("=== Pendaftaran Pasien ===");
        klinik.enqueue(101);
        klinik.enqueue(102);
        klinik.enqueue(103);

        System.out.println();
        System.out.println("=== Pemanggilan Pasien ===");
        klinik.dequeue();
        klinik.dequeue();
        klinik.dequeue();

        System.out.println();
        System.out.println("=== Kondisi Akhir ===");
        System.out.println("Nilai front = " + klinik.front);
        System.out.println("Nilai rear  = " + klinik.rear);
    }
}
