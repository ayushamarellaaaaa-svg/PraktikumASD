package LinkedList;

public class Latihan2 {

    static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;

    // Tambah node di akhir
    static void addLast(String data) {
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

    // Sisipkan node baru di depan (head baru)
    static void insertFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Cetak semua isi linked list
    static void print() {
        Node temp = head;
        System.out.print("Isi rangkaian: ");
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Kondisi awal: B -> C
        addLast("B");
        addLast("C");
        System.out.print("Sebelum penambahan -> ");
        print();

        // Sisipkan A di depan
        insertFirst("A");
        System.out.print("Setelah tambah A  -> ");
        print();
    }
}
