package Jobsheet12;

public class DoubleLinkedList {
    Node05 head;
    Node05 tail;
    int size;

    public DoubleLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }

    public void addFirst(Mahasiswa05 data) {
        Node05 newNode = new Node05(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Mahasiswa05 data) {
        Node05 newNode = new Node05(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void insertAfter(String keyNim, Mahasiswa05 data) {
        Node05 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan");
            return;
        }

        Node05 newNode = new Node05(data);

        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else {
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
        size++;
        System.out.println("Data berhasil ditambahkan setelah NIM " + keyNim);
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong!");
            return;
        }
        Node05 current = head;
        System.out.printf("%-10s %-10s %-5s %-10s\n", "Nama", "NIM", "Kls", "IPK");
        while (current != null) {
            current.data.tampilInformasi();
            current = current.next;
        }
    }

    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong!");
            return;
        }
        Node05 current = tail;
        System.out.printf("%-10s %-10s %-5s %-10s\n", "Nama", "NIM", "Kls", "IPK");
        while (current != null) {
            current.data.tampilInformasi();
            current = current.prev;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong!");
            return;
        }

        Mahasiswa05 deleted = head.data;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        size--;
        System.out.println("Data berhasil dihapus");
        System.out.printf("%-10s %-10s %-5s %-10s\n", "Nama", "NIM", "Kls", "IPK");
        deleted.tampilInformasi();
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong!");
            return;
        }

        Mahasiswa05 deleted = tail.data;

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }

        size--;
        System.out.println("Data berhasil dihapus");
        System.out.printf("%-10s %-10s %-5s %-10s\n", "Nama", "NIM", "Kls", "IPK");
        deleted.tampilInformasi();
    }

    public void add(int index, Mahasiswa05 data) {
        if (index < 0 || index > size) {
            System.out.println("Index tidak valid!");
            return;
        }

        if (index == 0) {
            addFirst(data);
            return;
        }

        if (index == size) {
            addLast(data);
            return;
        }

        Node05 newNode = new Node05(data);
        Node05 current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        newNode.prev = current;
        current.next.prev = newNode;
        current.next = newNode;
        size++;
        System.out.println("Data berhasil ditambahkan pada indeks " + index);
    }

    public void removeAfter(String keyNim) {
        Node05 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan");
            return;
        }

        if (current.next == null) {
            System.out.println("Tidak ada node setelah nim" + keyNim);
            return;
        }

        Node05 toDelete = current.next;
        Mahasiswa05 deleted = toDelete.data;

        if (toDelete == tail) {
            tail = current;
            current.next = null;
        } else {
            current.next = toDelete.next;
            toDelete.next.prev = current;
        }

        size--;
        System.out.println("Data setelah NIM " + keyNim + " berhasil dihapus");
        System.out.printf("%-10s %-10s %-5s %-10s\n", "Nama", "NIM", "Kls", "IPK");
        deleted.tampilInformasi();
    }

    public void remove(int index) {
        if (isEmpty()) {
            System.out.println("Linked List kosong!");
            return;
        }

        if (index < 0 || index >= size) {
            System.out.println("Index tidak valid!");
            return;
        }

        if (index == 0) {
            removeFirst();
            return;
        }

        if (index == size - 1) {
            removeLast();
            return;
        }

        Node05 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        Mahasiswa05 deleted = current.data;
        current.prev.next = current.next;
        current.next.prev = current.prev;

        size--;
        System.out.println("Data pada indeks " + index + " berhasil dihapus");
        System.out.printf("%-10s %-10s %-5s %-10s\n", "Nama", "NIM", "Kls", "IPK");
        deleted.tampilInformasi();
    }

    public void getFirst() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong!");
            return;
        }
        System.out.println("Data pertama:");
        System.out.printf("%-10s %-10s %-5s %-10s\n", "Nama", "NIM", "Kls", "IPK");
        head.data.tampilInformasi();
    }

    public void getLast() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong!");
            return;
        }
        System.out.println("Data terakhir:");
        System.out.printf("%-10s %-10s %-5s %-10s\n", "Nama", "NIM", "Kls", "IPK");
        tail.data.tampilInformasi();
    }

    public void getIndex(int index) {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong!");
            return;
        }

        if (index < 0 || index >= size) {
            System.out.println("Index tidak valid!");
            return;
        }

        Node05 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        System.out.println("Data pada indeks " + index + ":");
        System.out.printf("%-10s %-10s %-5s %-10s\n", "Nama", "NIM", "Kls", "IPK");
        current.data.tampilInformasi();
    }
}
