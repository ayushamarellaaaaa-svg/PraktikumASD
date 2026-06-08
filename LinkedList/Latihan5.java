package LinkedList;

public class Latihan5 {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;

    // Tambah node di akhir
    static void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Cari nilai skor tertinggi secara iteratif
    static int findMax() {
        Node temp = head;
        int max = temp.data; // anggap nilai pertama sebagai max awal
        while (temp != null) {
            if (temp.data > max) {
                max = temp.data;
            }
            temp = temp.next;
        }
        return max;
    }

    // Cetak semua skor
    static void print() {
        Node temp = head;
        System.out.print("Daftar skor: ");
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Skor peserta lomba
        addLast(80);
        addLast(95);
        addLast(75);

        print();
        System.out.println("Skor maksimum (pemenang): " + findMax());
    }
}
