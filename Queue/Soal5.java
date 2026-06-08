package Queue;

import java.util.Scanner;

public class Soal5 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        Node front, rear;

        boolean isEmpty() {
            return front == null;
        }

        void enqueue(int data) {
            Node newNode = new Node(data);
            if (rear == null) {
                front = rear = newNode;
                return;
            }
            rear.next = newNode;
            rear = newNode;
        }

        int dequeue() {
            int data = front.data;
            front = front.next;
            if (front == null)
                rear = null;
            return data;
        }
    }

    // ── Stack berbasis Array ────────────────────────────────
    static class Stack {
        int[] data;
        int top;

        Stack(int kapasitas) {
            data = new int[kapasitas];
            top = -1;
        }

        void push(int nilai) {
            data[++top] = nilai;
        }

        int peek() {
            return data[top];
        }
    }

    // ── Main ────────────────────────────────────────────────
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue antrian = new Queue();
        Stack arsip = new Stack(10);

        // Input 3 ID buku dari pengguna
        System.out.println("Masukkan 3 ID buku:");
        for (int i = 1; i <= 3; i++) {
            System.out.print("ID buku ke-" + i + ": ");
            int id = scanner.nextInt();
            antrian.enqueue(id);
        }

        System.out.println();
        System.out.println("=== Memindahkan Queue ke Stack ===");

        // Selama Queue tidak kosong: dequeue lalu push ke Stack
        while (!antrian.isEmpty()) {
            int data = antrian.dequeue();
            System.out.println("dequeue() = " + data + " -> push(" + data + ") ke Stack");
            arsip.push(data);
        }

        System.out.println();
        System.out.println("=== Kondisi Akhir Stack ===");
        System.out.println("ID buku di posisi TOP: " + arsip.peek());

        scanner.close();
    }
}
