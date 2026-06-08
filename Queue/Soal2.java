package Queue;

public class Soal2 {
    static class Node {
        int id;
        Node next;

        Node(int id) {
            this.id = id;
            this.next = null;
        }
    }

    // Kelas Queue
    static class Queue {
        Node front; // depan antrian
        Node rear; // belakang antrian

        Queue() {
            front = null;
            rear = null;
        }

        // Menambahkan barang ke belakang antrian
        void enqueue(int id) {
            Node newNode = new Node(id);

            if (rear == null) {
                front = newNode;
                rear = newNode;
            } else {
                rear.next = newNode;
                rear = newNode;
            }
        }

        // Menampilkan seluruh isi antrian dari depan ke belakang
        void print() {
            if (front == null) {
                System.out.println("Antrian kosong.");
                return;
            }

            System.out.print("Isi antrian: ");
            Node current = front;
            while (current != null) {
                System.out.print(current.id);
                if (current.next != null) {
                    System.out.print(" -> ");
                }
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue gudang = new Queue();

        // Memasukkan barang ID 100, 200, 300
        gudang.enqueue(100);
        gudang.enqueue(200);
        gudang.enqueue(300);

        // Menampilkan isi antrian
        gudang.print();
    }
}
