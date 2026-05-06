package Jobsheet11;

import org.w3c.dom.Node;

public class QueueLinkedList {
    NodeAntrian05 head;
    NodeAntrian05 tail;
    int size;

    public QueueLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean isFull() {
        return false; 
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
        System.out.println("Antrian dikosongkan");
    }

    public void enqueue(Antrian05 data) {
        NodeAntrian05 newNode = new NodeAntrian05(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        System.out.println(data.nama + " berhasil ditambahkan ke antrian\n");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!\n");
            return;
        }
        System.out.println("Mahasiswa dipanggil");
        head.data.tampilkanAntrian();
        head = head.next;
        if (head == null) tail = null;
        size--;
        System.out.println();
    }

    public void peekFront() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!\n");
            return;
        } else {
            System.out.println("Antrian terdepan:");
            head.data.tampilkanAntrian();
            System.out.println();
        }
    }

    public void peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!\n");
            return;
        } else {
            System.out.println("Antrian terakhir:");
            tail.data.tampilkanAntrian();
            System.out.println();
        }
    }

    public void jumlahAntrian() {
        System.out.println("Jumlah mahasiswa dalam antrian: " + size + "\n");
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!\n");
            return;
        }
        NodeAntrian05 tmp = head;
        int index = 1;
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        while (tmp != null) {
            System.out.println("Antrian ke-" + index + " :");
            tmp.data.tampilkanAntrian();
            tmp = tmp.next;
            index++;
        }
    }
}
