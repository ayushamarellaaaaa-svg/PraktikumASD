package Queue;

import java.util.Scanner;

public class Soal1 {
    // Node untuk menyimpan data dalam antrian
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Kelas Queue dengan operasi enqueue dan print
    static class Queue {
        Node front; // depan antrian
        Node rear; // belakang antrian

        Queue() {
            front = null;
            rear = null;
        }

        // Menambahkan data ke belakang antrian
        void enqueue(int data) {
            Node newNode = new Node(data);

            if (rear == null) {
                // Antrian masih kosong
                front = newNode;
                rear = newNode;
            } else {
                rear.next = newNode;
                rear = newNode;
            }

            System.out.println("Data " + data + " berhasil dimasukkan ke antrian.");
        }

        // Menampilkan seluruh isi antrian dari depan ke belakang
        void print() {
            if (front == null) {
                System.out.println("Antrian kosong.");
                return;
            }

            System.out.print("Isi antrian (depan -> belakang): ");
            Node current = front;
            while (current != null) {
                System.out.print(current.data);
                if (current.next != null) {
                    System.out.print(" -> ");
                }
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue antrian = new Queue();

        // Memasukkan data 15 dan 30 menggunakan enqueue()
        antrian.enqueue(15);
        antrian.enqueue(30);

        System.out.println();

        // Menampilkan isi antrian menggunakan print()
        antrian.print();
    }
}
